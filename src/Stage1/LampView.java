import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class LampView extends Group {

    public LampView () {
        Polygon base = new Polygon();
        base.getPoints().addAll(18d, 20d,
                18d, 50d,
                13d, 50d,
                10d, 53d,
                10d, 60d,
                30d, 60d,
                30d, 53d,
                27d, 50d,
                22d, 50d,
                22d, 20d);
        base.setFill(Color.BLACK);
        Polygon ls = new Polygon();
        ls.getPoints().addAll(0d, 20d,
                40d, 20d,
                30d, 5d,
                10d, 5d);
        ls.setFill(Color.BLACK);
        getChildren().addAll(base, ls);
        lampshade = ls;
    }
    public void setColor(double r, double g, double b){
        lampshade.setFill(Color.color(r, g, b));
    }
    private final Polygon lampshade;
}
