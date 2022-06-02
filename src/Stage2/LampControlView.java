import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class LampControlView extends VBox {
    public LampControlView(LampControl lampControl) {
        Image img = new Image("rsc/powerImage.jpg");
        ImageView view = new ImageView(img);
        view.setFitWidth(20);
        view.setFitHeight(20);
        view.setOnMouseClicked(value ->  {
            lampControl.pressPower();
        });
        getChildren().addAll(view);
    }
}
