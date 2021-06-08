package observer3;

public class Main {
    public static void main(String[] args) {
        WildAnimal wildAnimal = new WildAnimal();

        HunterWithGun hunterWithGun = new HunterWithGun(wildAnimal);
        HunterWithArrow hunterWithArrow = new HunterWithArrow(wildAnimal);



        wildAnimal.setHuntWithGun(false);
        wildAnimal.callHunter();

        Animal animal1 = new LandAnimal();
        Animal animal2 = new SeaAnimal();
        Animal animal3 = new SeaAnimal();
        Animal animal4 = new SeaAnimal();
        wildAnimal.addAnimal(animal1);
        wildAnimal.addAnimal(animal2);
        wildAnimal.addAnimal(animal3);
        wildAnimal.addAnimal(animal4);

        System.out.println("---");
        wildAnimal.shotAnimalWithBowOrGun();

    }
}
