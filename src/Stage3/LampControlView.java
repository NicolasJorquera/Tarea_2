import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class LampControlView extends VBox {
    public LampControlView(LampControl lampControl) {
        Image img = new Image("rsc/powerImage.jpg");
        TextField lampChannelInput = new TextField();
        lampChannelInput.setText("0");
        lampChannelInput.setMaxWidth(30);
        lampChannelInput.setAlignment(Pos.CENTER);
        lampChannelInput.setOnKeyTyped(value -> {
            if ( lampChannelInput.getText() != "") {
                lampControl.setChannel(Integer.parseInt(lampChannelInput.getText()));
            }
        });

        ImageView view = new ImageView(img);
        view.setFitWidth(20);
        view.setFitHeight(20);
        view.setOnMouseClicked(value ->  {
            lampControl.pressPower();
        });
        getChildren().addAll(view, lampChannelInput);
    }
}
