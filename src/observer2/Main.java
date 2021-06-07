package observer2;

public class Main {
    public static void main(String[] args) {
        Tasr tasr = new Tasr();
        new EmailSend(tasr);
        new SmsSend(tasr);
        new FaxSend(tasr);
        new FbSend(tasr);

        tasr.setPriority(1);
        tasr.setMessage("Ahoj");
    }
}
