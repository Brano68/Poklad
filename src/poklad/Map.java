package poklad;

import java.util.Scanner;

public class Map {
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    private int[][] map;

    public Map(){
        map = new int[12+2][12+2]; //+2 kvoli hraniciam
        fillMapWithNull();
        fillMapWithIsland();

    }

    //naplni pole nulami a hranice jednotkami
    private void fillMapWithNull(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(i == 0 || i == map.length-1 || j == 0 || j== map[0].length-1){
                    map[i][j] = 1;
                }else{
                    map[i][j] = 0;
                }
            }
        }
    }

    public void printMapQuickly(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    //naplni pole ostrovami
    private void fillMapWithIsland(){
        //12cisel
        int[] islands = new int[]{255,0,4000,2000,36,1,
                                  47,4095,687,68,827,4000};

        //pole na binarne string
        String[] islandsInBinary = new String[12];

        //prevedieme na binarnu
        for(int i = 0; i <islands.length; i++){
            islandsInBinary[i] = Integer.toBinaryString(islands[i]);
            while(islandsInBinary[i].length() != islands.length){
                islandsInBinary[i] = "0" + islandsInBinary[i];
            }
            System.out.println(i + " " + islandsInBinary[i]);
        }

        //teraz naplnime

        for(int i = 0; i < islandsInBinary.length; i++){
            for(int j = 0; j < islandsInBinary[i].length(); j++){
                if(islandsInBinary[i].charAt(j) == '0'){
                    continue;
                }else{
                    map[i+1][j+1] = 1;
                }
            }
        }


    }

    //vykresli mapu
    public void printMap(){
        System.out.print("     ");
        for(int i = 1; i < map[0].length-1; i++){
            if(i<10){
                System.out.print(ANSI_PURPLE_BACKGROUND+i + "   "+ANSI_RESET);
            }else{
                System.out.print(ANSI_PURPLE_BACKGROUND+i + " "+ANSI_RESET);
            }
        }
        System.out.println();
        System.out.println();

        for(int i = 1; i < map.length-1; i++){
            if(i<10){
                System.out.print(ANSI_PURPLE_BACKGROUND+i + " : "+ANSI_RESET);
            }else{
                System.out.print(ANSI_PURPLE_BACKGROUND+i + ": "+ANSI_RESET);
            }
            for(int j = 1; j < map[0].length-1; j++){
                if(map[i][j] == -2){
                    System.out.print( ANSI_CYAN_BACKGROUND+"LL"+ANSI_RESET + "  ");
                }else if(map[i][j] == -3){
                    System.out.print( ANSI_YELLOW_BACKGROUND+"PP"+ANSI_RESET + "  ");
                }else if(map[i][j] < 10){
                    System.out.print( " " + map[i][j] + "  ");
                }else{
                    System.out.print( map[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    //zadat poziciu lode
    public void enterIndexesForShip(){
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do{
            System.out.println("Zadaj poziciu X pre LOD (-2)");
            x = scanner.nextInt();
            System.out.println("Zadaj poziciu Y pre LOD (-2)");
            y = scanner.nextInt();
            if(map[x][y] == 0){
                map[x][y] = -2;
            }else{
                System.out.println("ZADAJ INE SURADNICE JE TAM PEVNINA");
            }
        }while (map[x][y]!=-2);

    }

    //zadat poziciu pokladu
    public void enterIndexesForGold(){
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do{
            System.out.println("Zadaj poziciu X pre POKLAD (-3)");
            x = scanner.nextInt();
            System.out.println("Zadaj poziciu Y pre POKLAD (-3)");
            y = scanner.nextInt();
            if(map[x][y] == 0){
                map[x][y] = -3;
            }else{
                System.out.println("ZADAJ INE SURADNICE JE TAM PEVNINA");
            }
        }while (map[x][y]!=-3);

    }


    //najdi cestu
    public void findYourney(){
        //ci nie sme hned pri poklade
        if (checkIsNextToGold()){
            System.out.println("Si hned pri poklade!!!");
            return;
        }
        //najdeme lod -2
        int lodX = suradniceLode()[0];
        int lodY = suradniceLode()[1];

        System.out.println(lodX + " " + lodY);

        int maxRiadok = map.length;
        int maxStlpec = map[0].length;
        int maxPocetKombinacii = maxRiadok*maxStlpec;

        //obkolesime lod dvojkami
        if(map[lodX+1][lodY] == 0){
            map[lodX+1][lodY] = 2;
        }
        if(map[lodX-1][lodY] == 0){
            map[lodX-1][lodY] = 2;
        }
        if(map[lodX][lodY-1] == 0){
            map[lodX][lodY-1] = 2;
        }
        if(map[lodX][lodY+1] == 0){
            map[lodX][lodY+1] = 2;
        }

        //teraz zistime ci je nejaka dvojka v poli
        //ked neni tak lod je uviaznuta
        if(checkIsShipIsFree() == false){
            System.out.println("LOD JE UVIAZNUTA");
            return;
        }
        int den = 2;
        while(maxPocetKombinacii>=0){
            //System.out.println("som vo while");
            for(int i = 1; i < map.length-1; i++){
                for(int j = 1; j < map[0].length-1; j++){
                    if(map[i][j] == den){
                        if(map[i+1][j] == 0){
                            map[i+1][j] = den+1;
                        }
                        if(map[i-1][j] == 0){
                            map[i-1][j] = den+1;
                        }
                        if(map[i][j-1] == 0){
                            map[i][j-1] = den+1;
                        }
                        if(map[i][j+1] == 0){
                            map[i][j+1] = den+1;
                        }
                    }
                }
            }
            den++;
            maxPocetKombinacii--;
        }

        //teraz zistime ci pri poklade je nejaka ina suradnica ako 0 alebo 1
        //ked hej je riesenie ked nie neni riesenie
        if(isThereAnySolution()){
            System.out.println("Je to vyriesitelne");
        }else{
            System.out.println("Nie je to vyriesitelne");
        }
    }

    private boolean checkIsShipIsFree(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[i][j] == 2){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkIsNextToGold(){
        int x = suradniceLode()[0];
        int y = suradniceLode()[1];
        if(map[x][y+1] == -3){
            return true;
        }
        if(map[x][y-1] == -3){
            return true;
        }
        if(map[x+1][y] == -3){
            return true;
        }
        if(map[x-1][y] == -3){
            return true;
        }
        return false;
    }

    private boolean isThereAnySolution(){
        int x = suradnicePoklad()[0];
        int y = suradnicePoklad()[1];
        if((map[x+1][y] == 0 || map[x+1][y] == 1) && (map[x-1][y] == 0 || map[x-1][y] == 1)
        && (map[x][y+1] == 0 || map[x][y+1] == 1) && (map[x][y-1] == 0 || map[x][y-1] == 1)){
            return false;
        }
        return true;
    }

    private int[] suradniceLode(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[i][j] == -2){
                    int[] pole = new int[2];
                    pole[0] = i;
                    pole[1] = j;
                    return pole;
                }
            }
        }
        return null;
    }

    private int[] suradnicePoklad(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[i][j] == -3){
                    int[] pole = new int[2];
                    pole[0] = i;
                    pole[1] = j;
                    return pole;
                }
            }
        }
        return null;
    }

}
