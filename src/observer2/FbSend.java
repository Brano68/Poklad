package observer2;

public class FbSend extends Observer{
    public FbSend(Tasr tasr){
        this.tasr = tasr;
        this.tasr.addObserver(this);
    }

    @Override
    public void sendMessages(String message) {
        System.out.println("I am sending Fb message " + message);
    }
}
