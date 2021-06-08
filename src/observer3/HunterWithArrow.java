package observer3;

public class HunterWithArrow extends HunterObserver{

    public HunterWithArrow(WildAnimal wildAnimal){
        this.wildAnimal = wildAnimal;
        this.wildAnimal.addHunter(this);
    }

    @Override
    public void shot() {
        System.out.println("Arrow ----->");
    }
}
