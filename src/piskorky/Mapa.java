package piskorky;

public class Mapa {

    private char[][] matica;

    //vytvorenie mapy v konstruktore
    public Mapa(){
        matica = new char[][]{
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'}};
    }

    //metoda na to ci obsahuje nejake prazdne miesta
    public boolean isThereAnyFreeSpace(){
        for(int i = 0; i < matica.length; i++){
            for(int j = 0; j < matica[0].length; j++){
                if(matica[i][j] == '-'){
                    return true;
                }
            }
        }
        return false;
    }

    //metoda na vykreslenie mapy
    public void printMap(){
        System.out.println("    0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 ");
        for(int i = 0; i < matica.length; i++){
            if(i<10){
                System.out.print(i + " : ");
            }else{
                System.out.print(i + ": ");
            }
            for(int j = 0; j < matica[0].length; j++){
                System.out.print(matica[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //metoda na overenie ci je suradnica volna
    public boolean checkIfTillIsFree(int x, int y){
        if(matica[x][y] == '-'){
            return true;
        }else{
            return false;
        }
    }

    //metoda na prepisanie dlazdice
    public void rewriteMatrix(int x, int y, char znak){
        matica[x][y] = znak;
    }

    //metoda na delenie matice na mensie s rozmermi 5*5
    public String divideMatrix(){
        int riadok = 0, stlpec = 0;
        //posuvam stvorec rozmeru 5*5 spolu 11krat v radku a postupne s nim idem nizsie
        //cize posuniem ho spolu 11*11krat

        //matica ktoru overujem
        char[][] matica5x5 = new char[5][5];

        //definicia premennych
        int i,j = 0;
        int k = 0,l = 0;

        //stvorec 5*5 dokazem posunut 11*11krat
        for(int m = 0; m < 11*11; m++){
            for(i = riadok; i < riadok+5; i++){
                for(j = stlpec; j < stlpec+5; j++){
                    //vyskladat maticu 5*5
                    matica5x5[k][l] = matica[i][j];
                    l++;
                    //System.out.print( " "+i + "," + j);
                }
                l = 0;
                k++;
                //System.out.println();
            }
            k = 0;
            stlpec++;
            //System.out.println("posun");
            if(j==15){
                riadok = riadok + 1;
                stlpec = 0;
            }
            //tu budeme volat overovanie matice 5*5
            if(isWinner(matica5x5)){
                System.out.println("Nasiel sa vitaz");
                return "Nasiel sa vitaz";
            }
        }

        return "Zatial sa nenasiel vitaz!!!";
    }


    //metoda na overovanie matice 5*5
    private boolean isWinner(char[][] matica){
        /*

        for(int i = 0; i < matica.length; i++){
            for(int j = 0; j < matica[0].length; j++){
                System.out.print(matica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        */
        //prejdeme riadky
        String retazec = "";
        for(int i = 0; i < matica.length; i++){
            for(int j = 0; j < matica[0].length; j++){
                retazec = retazec + matica[i][j];
            }
            if(retazec.equals("ooooo")){
                System.out.println("Vitaz je o");
                return true;
            }
            if(retazec.equals("xxxxx")){
                System.out.println("Vitaz je x");
                return true;
            }
            retazec = "";
        }

        //prejdeme stlpce
        for(int i = 0; i < matica.length; i++){
            for(int j = 0; j < matica[0].length; j++){
                retazec = retazec + matica[j][i];
            }
            if(retazec.equals("ooooo")){
                System.out.println("Vitaz je o");
                return true;
            }
            if(retazec.equals("xxxxx")){
                System.out.println("Vitaz je x");
                return true;
            }
            retazec = "";
        }

        //prejdeme uhlopriecku
        for(int i = 0; i < matica.length; i++){
            for(int j = 0; j < matica[0].length; j++){
                if(i==j){
                    retazec = retazec + matica[i][j];
                }
            }
        }
        if(retazec.equals("xxxxx")){
            System.out.println("Vitaz je x");
            return true;
        }
        if(retazec.equals("ooooo")){
            System.out.println("Vitaz je o");
            return true;
        }

        retazec = "";

        //prejdeme druhu uhlopriecku
        for(int i = 0; i < matica.length; i++){
            for(int j = 0; j < matica[0].length; j++){
                if(i+j == 4){
                    retazec = retazec + matica[i][j];
                }
            }
        }

        if(retazec.equals("xxxxx")){
            System.out.println("Vitaz je x");
            return true;
        }
        if(retazec.equals("ooooo")){
            System.out.println("Vitaz je o");
            return true;
        }
        //ak nic neprejde tak nenastala zhoda
        return false;
    }


}
