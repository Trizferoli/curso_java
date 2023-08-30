
public class User {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv =  new SmartTv();

        System.out.println("IS ON? " + smartTv.isOn);
        System.out.println("CHANNEL: " + smartTv.channel);
        System.out.println("VOLUME: " + smartTv.volume);
        
        smartTv.turnOff();
        System.out.println("IS ON? " + smartTv.isOn);

        smartTv.volumeUp();
        System.out.println("VOLUME: " + smartTv.volume);
    }
}
