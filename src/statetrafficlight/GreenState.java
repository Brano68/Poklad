package statetrafficlight;

public class GreenState implements State{
    @Override
    public void doAction(TrafficLight trafficLight) {
        System.out.println("TL -> GREEN");
    }
}
