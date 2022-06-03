import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class LampControlView extends BorderPane {
    public LampControlView(LampControl lampControl) {
        Image img = new Image("rsc/powerImage.jpg");
        TextField lampChannelInput = new TextField();
        lampChannelInput.setText(lampControl.getChannel()+"");
        lampChannelInput.setMaxWidth(30);
        lampChannelInput.setAlignment(Pos.CENTER);
        lampChannelInput.setOnKeyTyped(value -> {
            if ( lampChannelInput.getText() != "") {
                lampControl.setChannel(Integer.parseInt(lampChannelInput.getText()));
            }
        });




        Slider slider1 = new Slider();
        slider1.setMin(0);
        slider1.setMax(255);
        slider1.setMaxWidth(70);
        Label label1 = new Label("R");
        Label value1 = new Label("0");
        slider1.setOnMouseDragged(value -> {
            value1.setText(Math.round(slider1.getValue())+"");
        });
        HBox hBox1 =new HBox(label1, slider1, value1);


        Slider slider2 = new Slider();
        slider2.setMin(0);
        slider2.setMax(255);
        slider2.setMaxWidth(70);
        Label label2 = new Label("G");
        Label value2 = new Label("0");
        slider2.setOnMouseDragged(value -> {
            value2.setText(Math.round(slider2.getValue())+"");
        });
        HBox hBox2 =new HBox(label2, slider2, value2);

        Slider slider3 = new Slider();
        slider3.setMin(0);
        slider3.setMax(255);
        slider3.setMaxWidth(70);
        Label label3 = new Label("B");
        Label value3 = new Label("0");
        slider3.setOnMouseDragged(value -> {
            value3.setText(Math.round(slider3.getValue())+"");
        });
        HBox hBox3 =new HBox(label3, slider3, value3);


        BorderPane pane = new BorderPane();
        pane.setMaxWidth(100);
        pane.setTop(hBox1);
        pane.setCenter(hBox2);
        pane.setBottom(hBox3);


        ImageView view = new ImageView(img);
        view.setFitWidth(20);
        view.setFitHeight(20);
        view.setOnMouseClicked(value ->  {
            lampControl.changeColor((int) slider1.getValue(), (int) slider2.getValue(), (int) slider3.getValue());
            lampControl.pressPower();
        });

        setTop(view);
        setCenter(lampChannelInput);
        setBottom(pane);
        setAlignment(view, Pos.CENTER);

        Border border = new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));
        setBorder(border);
    }
}
