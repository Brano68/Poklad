package poklad;

public class Main {

    public static void main(String[] args) {
        Map map = new Map();
        //vypise aj hranice co su pomocne
        map.printMapQuickly();
        map.printMap();
        //zada suradnice
        map.enterIndexesForShip();
        map.enterIndexesForGold();
        //vykresli suradnice
        map.printMap();
        map.findYourney();
        map.printMap();
    }

}
