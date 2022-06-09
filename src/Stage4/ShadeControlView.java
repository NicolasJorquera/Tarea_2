import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class ShadeControlView extends BorderPane {
    public ShadeControlView (ShadeControl shadeControl){
        Button channelButton = new Button(""+shadeControl.getChannel());

        channelButton.setOnAction( e-> {
            shadeControl.stop();
        });
        Image img = new Image("rsc/arrow.png");
        ImageView view1 = new ImageView(img);
        view1.setTranslateY(5);
        view1.setTranslateX(27);
        view1.setRotate(270);
        view1.setFitWidth(30);
        view1.setFitHeight(20);
        view1.setOnMouseClicked(value ->  {
            shadeControl.startUp();
        });
        ImageView view2 = new ImageView(img);
        view2.setTranslateY(-5);
        view2.setTranslateX(27);
        view2.setRotate(90);
        view2.setFitWidth(30);
        view2.setFitHeight(20);
        view2.setOnMouseClicked(value ->  {
            shadeControl.startDown();
        });
        ImageView view3 = new ImageView(img);
        view3.setTranslateY(21);
        view3.setTranslateX(-5);
        view3.setRotate(180);
        view3.setFitWidth(30);
        view3.setFitHeight(20);
        view3.setOnMouseClicked(value ->  {
            shadeControl.channelDown();
            channelButton.setText(""+shadeControl.getChannel());
        });
        ImageView view4 = new ImageView(img);
        view4.setTranslateY(21);
        view4.setTranslateX(5);
        view4.setFitWidth(30);
        view4.setFitHeight(20);
        view4.setOnMouseClicked(value ->  {
            shadeControl.channelUp();
            channelButton.setText(""+shadeControl.getChannel());
        });
        setCenter(channelButton);
        setTop(view1);
        setBottom(view2);
        setLeft(view3);
        setRight(view4);

        Border border = new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));
        setBorder(border);
    }
}
