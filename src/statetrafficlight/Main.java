package statetrafficlight;

public class Main {
    public static void main(String[] args) {
        TrafficLight tl1 = new TrafficLight();

        RedState redState = new RedState();
        OrangeState orangeState = new OrangeState();
        GreenState greenState = new GreenState();

        tl1.setState(redState);

    }
}
