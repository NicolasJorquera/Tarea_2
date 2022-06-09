import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class RollerShadeView extends Group {
    public RollerShadeView(double maxLength, double width, double length, double radius, Color color) {
        clothColor = color;
        Rectangle background = new Rectangle(5,5, width-10,maxLength-5);
        background.setFill(Color.BLUE);  // I chose Blue
        getChildren().add(background);

        cloth = new Rectangle (0,5, width, maxLength);
        cloth.setFill(Color.TRANSPARENT);
        getChildren().add(cloth);

        Cylinder roller = new Cylinder(5, width);

        PhongMaterial blueStuff = new PhongMaterial();
        blueStuff.setDiffuseColor(Color.DARKRED);
        roller.setMaterial(blueStuff);

        roller.setRotate(90);
        roller.setTranslateX(width/2);
        getChildren().add(roller);

        // Rolled up shade cloth
        Ellipse rightSide = new Ellipse(width, radius,radius/2,radius);
        rightSide.setFill(color);
        rightSide.setStroke(Color.BLACK);
        //¿?
    }
    public void setLength(double length) {
        cloth.setHeight(length);
        cloth.setFill(clothColor);
    }
    private Rectangle cloth;
    private Color clothColor;
}
