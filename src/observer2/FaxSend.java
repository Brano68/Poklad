package observer2;

public class FaxSend extends Observer{
    public FaxSend(Tasr tasr){
        this.tasr = tasr;
        this.tasr.addObserver(this);
    }

    @Override
    public void sendMessages(String message) {
        System.out.println("I am sending faxes " + message);
    }
}
