package statetrafficlight;

public class OrangeState implements State{
    @Override
    public void doAction(TrafficLight trafficLight) {
        System.out.println("TL -> ORANGE");
    }
}
