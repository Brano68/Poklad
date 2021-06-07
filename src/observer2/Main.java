package observer2;

public class Main {
    public static void main(String[] args) {
        Tasr tasr = new Tasr();
        new EmailSend(tasr);
        new SmsSend(tasr);
        new FaxSend(tasr);
        new FbSend(tasr);

        //nastavenie priority cez setter a v Tasr mam metodu, ktora
        //overuje prioritu a porovnava akej je instancie a ake je cislo
        //a na zaklade toho sa vypise
        //ak je 1 vsetke ju vzpisu
        //ak je 4 nikto
        //ak je 2 tak email a sms
        //ak je 3 tak Fb a Fax
        tasr.setPriority(1);
        tasr.setMessage("Ahoj");
    }
}
