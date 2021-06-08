package observer3;

import java.util.ArrayList;
import java.util.List;

public class WildAnimal {
    private List<HunterObserver> listOfHunter;
    private boolean huntWithGun;
    private List<Animal> animals;

    public WildAnimal(){
        listOfHunter = new ArrayList<>();
        animals = new ArrayList<>();
    }

    public void setHuntWithGun(boolean huntWithGun) {
        this.huntWithGun = huntWithGun;
    }

    public void addHunter(HunterObserver hunterObserver){
        listOfHunter.add(hunterObserver);
    }


    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void callHunter(){
        for(HunterObserver hunterObserver : listOfHunter){
            if(huntWithGun && hunterObserver instanceof HunterWithGun){
                hunterObserver.shot();
            }
            if(!(huntWithGun) && (hunterObserver instanceof HunterWithArrow)){
                hunterObserver.shot();
            }
        }
    }


    public void shotAnimalWithBowOrGun(){
        for(Animal animal : animals){
            if(animal instanceof SeaAnimal){
                for(HunterObserver hunterObserver : listOfHunter){
                    if(hunterObserver instanceof HunterWithArrow){
                        hunterObserver.shot();
                    }
                }
            }else{
                for(HunterObserver hunterObserver : listOfHunter){
                    if(hunterObserver instanceof HunterWithGun){
                        hunterObserver.shot();
                    }
                }
            }
        }
    }





}
