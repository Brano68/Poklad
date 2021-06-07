package observer2;

public class SmsSend extends Observer{

    public SmsSend(Tasr tasr){
        this.tasr = tasr;
        this.tasr.addObserver(this);
    }

    @Override
    public void sendMessages(String message) {
        System.out.println("I am sending sms " + message);
    }
}
