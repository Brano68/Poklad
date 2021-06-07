package observer2;

import java.util.ArrayList;
import java.util.List;

public class Tasr {
    private String message;
    private List<Observer> observers = new ArrayList<>();
    private int priority;

    public Tasr(){

    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllPortals();
    }

    public void notifyAllPortals(){
        for(Observer observer : observers){
            if(priority == 4){
                System.out.println("Nothing important");
                return;
            }
            if(priority == 1){
                observer.sendMessages(message);
                continue;
            }
            if(priority == 2 && (observer instanceof EmailSend || observer instanceof SmsSend)){
                observer.sendMessages(message);
                continue;
            }
            if(priority == 3 && (observer instanceof FbSend || observer instanceof FaxSend)){
                observer.sendMessages(message);
                continue;
            }
        }
    }
}
