package statetrafficlight;

public class TrafficLight {
    private State state;

    public TrafficLight(){
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}




