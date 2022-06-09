import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Stage4 extends Application {
    public void start(Stage primaryStage) {
        int lampChannel=2;
        int lampChannel2=3;
        Cloud cloud = new Cloud();
        Lamp lamp = new Lamp(lampChannel);
        cloud.addLamp(lamp);
        Lamp lamp2 = new Lamp(lampChannel2);
        cloud.addLamp(lamp2);
        LampControl lampControl = new LampControl(lampChannel, cloud);
        HBox hBox = new HBox(20);
        hBox.setPadding(new Insets(20));
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(lamp.getView(), lamp2.getView(), lampControl.getView());
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(20));
        pane.setBottom(hBox);
        int shadeChannel1=2;
        int shadeChannel2=3;
        RollerShade rs1 = new RollerShade(shadeChannel1, 2, 150, 100);
        RollerShade rs2 = new RollerShade(shadeChannel2, 10, 200, 150);
        cloud.addRollerShade(rs1);
        pane.setLeft(rs1.getView());
        cloud.addRollerShade(rs2);
        pane.setRight(rs2.getView());
        ShadeControl shadeControl = new ShadeControl(shadeChannel1,cloud);
        hBox.getChildren().add(0,shadeControl.getView());
        Scene scene = new Scene(pane, 500, 350);
        primaryStage.setTitle("Domotic Devices Simulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
