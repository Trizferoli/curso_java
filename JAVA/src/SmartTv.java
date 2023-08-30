public class SmartTv {
    boolean isOn=false;
    int channel=1;
    int volume=5;

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public void volumeDown(){
        volume--;
    }

    public void volumeUp(){
        volume++;
    }
}
