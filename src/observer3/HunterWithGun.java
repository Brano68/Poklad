package observer3;

public class HunterWithGun extends HunterObserver{

    public HunterWithGun(WildAnimal wildAnimal){
        this.wildAnimal = wildAnimal;
        this.wildAnimal.addHunter(this);
    }

    @Override
    public void shot() {
        System.out.println("Bullets * * *");
    }
}
