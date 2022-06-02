import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ShadeControlView extends BorderPane {
    public ShadeControlView (ShadeControl shadeControl){
        Button channelButton = new Button(""+shadeControl.getChannel());
        channelButton.setOnAction( e-> {
            shadeControl.stop();
        });
        Image img = new Image("rsc/arrow.png");
        ImageView view1 = new ImageView(img);
        view1.setTranslateY(-20);
        view1.setRotate(270);
        view1.setFitWidth(30);
        view1.setFitHeight(20);
        view1.setOnMouseClicked(value ->  {
            shadeControl.startUp();
        });
        ImageView view2 = new ImageView(img);
        view2.setTranslateY(20);
        view2.setRotate(90);
        view2.setFitWidth(30);
        view2.setFitHeight(20);
        view2.setOnMouseClicked(value ->  {
            shadeControl.startDown();
        });
        setCenter(channelButton);
        setTop(view1);
        setBottom(view2);
        // ¿?
    }
}
