package udemyy;

public class Holden extends Car{

    public Holden(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public void startEngine(){
        System.out.println("Holden -> startEngine()");
    }
    @Override
    public void accelerate(){
        System.out.println("Holden -> accelerate()");
    }
    @Override
    public void brake(){
        System.out.println("Holden -> brake()");
    }
}
