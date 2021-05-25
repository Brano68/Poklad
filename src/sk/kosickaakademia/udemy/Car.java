package sk.kosickaakademia.udemy;

public class Car extends Vozidlo implements Vehicle{

    public static void main(String[] args) {
        Car car1 = new Car(12);
        int result = car1.urobRozdiel(new Car(5));
        System.out.println(result);
        if(car1 instanceof Vehicle){
            System.out.println("Som rozhranim");
        }
        car1.sayHello();
        car1.pozdrav();
        car1.metodaVozidlo();
    }

    private int pocetMiest;

    public Car(int pocetMiest){
        this.pocetMiest = pocetMiest;
    }

    public int getPocetMiest(){
        return pocetMiest;
    }

    public int urobRozdiel(Car car){
        return this.getPocetMiest() - car.getPocetMiest();
    }

    public void pozdrav(){
        super.metodaVozidlo();
    }

    @Override
    public void sayHello() {
        System.out.println("Nazdar");
    }

    @Override
    public void metodaVozidlo() {
        System.out.println("TRieda car");
    }
}
