import javafx.scene.Node;

public class Lamp {
    public Lamp (int channel){
        this.channel= channel;
        r = 0.9;
        g = 0.8;
        b = 0;
        state = LampState.OFF;
        view = new LampView(channel);
    }
    public int getChannel(){
        return channel;
    }
    public void changeColor(int red, int green, int blue){
        r = Double.valueOf(red)/255;
        g = Double.valueOf(green)/255;
        b = Double.valueOf(blue)/255;
    }
    public void changePowerState(){
        state = state==LampState.ON ? LampState.OFF : LampState.ON;
        if (state==LampState.OFF) {
            view.setColor((short) 0, (short) 0, (short) 0);
        }
        else{
            view.setColor(r,g,b);
        }
    }
    public Node getView() {
        return view;
    }
    private int channel;
    private double r,g,b;
    private LampState state;
    private LampView view;
}
