import java.util.ArrayList;

public class Cloud {
    public Cloud() {
        lamps = new ArrayList<Lamp>();
        rollerShades = new ArrayList<RollerShade>();
    }
    public void addLamp(Lamp l){
        lamps.add(l);
    }

    public void addRollerShade(RollerShade rs){
        rollerShades.add(rs);
    }

    public Lamp getLampAtChannel(int channel){
        for (Lamp l: lamps)
            if (l.getChannel() ==channel)
                return l;
        return null;
    }
    public RollerShade getRollerShadeAtChannel(int channel){
        for (RollerShade rs: rollerShades)
            if (rs.getChannel() == channel)
                return rs;
        return null;
    }
    public void changeLampPowerState(int channel){
        Lamp l=getLampAtChannel(channel);
        if (l != null) l.changePowerState();
    }
    public void changeLampColor(int channel, int r, int g, int b){
        Lamp l=getLampAtChannel(channel);
        if (l != null) l.changeColor(r, g, b);
    }
    public void startShadeUp(int channel){
        RollerShade rs = getRollerShadeAtChannel(channel);
        if (rs != null) rs.startUp();
    }
    public void startShadeDown(int channel){
        RollerShade rs = getRollerShadeAtChannel(channel);
        if (rs != null) rs.startDown();
    }
    public void stopShade(int channel){
        RollerShade rs = getRollerShadeAtChannel(channel);
        if (rs != null) rs.stop();
    }
    private ArrayList<Lamp> lamps;
    private ArrayList<RollerShade> rollerShades;
}
