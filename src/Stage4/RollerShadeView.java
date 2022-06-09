import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

import java.io.File;

public class RollerShadeView extends Group {
    public RollerShadeView(double maxLength, double width, int channel, double radius, Color color) {
        clothColor = color;
        Rectangle2D background = new Rectangle2D(5,5, width-10,maxLength-5);
        

        if (channel == 2){
            Media media1 = new Media(new File("src/Stage4/rsc/cuadrado.mp4").toURI().toString());
            MediaPlayer mediaPlayer1 = new MediaPlayer(media1);
            mediaPlayer1.setAutoPlay(true);
            mediaPlayer1.setMute(true);
            MediaView mediaView1 = new MediaView (mediaPlayer1);
            mediaView1.setX(5);
            mediaView1.setY(5);
            mediaView1.setFitWidth(width -10);
            getChildren().add(mediaView1);
            
        }else if(channel == 3){
            Media media2 = new Media(new File("src/Stage4/rsc/rectangulo.mp4").toURI().toString());
            MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
            mediaPlayer2.setAutoPlay(true);
            mediaPlayer2.setMute(true);
            MediaView mediaView2 = new MediaView (mediaPlayer2);
            mediaView2.setX(5);
            mediaView2.setY(5);
            mediaView2.setFitWidth(width -10);
            getChildren().add(mediaView2);
        }

        

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
