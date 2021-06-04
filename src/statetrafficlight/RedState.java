package statetrafficlight;

public class RedState implements State{
    @Override
    public void doAction(TrafficLight trafficLight) {
        System.out.println("TL -> RED");
    }
}
