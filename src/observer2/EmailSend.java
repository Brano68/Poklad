package observer2;

public class EmailSend extends Observer{

    public EmailSend(Tasr tasr){
        this.tasr = tasr;
        this.tasr.addObserver(this);
    }

    @Override
    public void sendMessages(String message) {
        System.out.println("I am sending emials " + message);
    }
}
