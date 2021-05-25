package sk.kosickaakademia.udemy;

public interface Vehicle {

    default public void sayHello(){
        System.out.println("Hello");
    }
}
