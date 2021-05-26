package piskorky;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------HRA piskvorky--------");

        Mapa mapa = new Mapa();
        mapa.printMap();

        while (mapa.isThereAnyFreeSpace()){
            System.out.println("1. Hrac zadaj suradnice kde chces polozit symbol \"o\" ");
            System.out.println("Suradnica Riadka");
            int x = scanner.nextInt();
            System.out.println("Suradnica Stlpca");
            int y = scanner.nextInt();
            if(mapa.checkIfTillIsFree(x,y)){
                mapa.rewriteMatrix(x,y,'o');
            }else{
                System.out.println("Zadaj suradnice znovu lebo uz je obsadena!!!");
                continue;
            }
            //vykreslime mapu
            mapa.printMap();

            //teraz overime ci hrac o neni vitaz
            if(mapa.divideMatrix().equals("Nasiel sa vitaz")){
                System.out.println("Vitaz je hrac cislo 1 - o");
                break;
            }

            //ak hrac1 nevyhral
            //pokracujeme s hracom2
            //najprv overime ci je volna dlazdica
            if(!(mapa.isThereAnyFreeSpace())){
                System.out.println("Nie su volne ziadne dlazdice!!!");
                break;
            }
            //v pripade ze su volne pokracujeme
            while(true){
                System.out.println("2. Hrac zadaj suradnice kde chces polozit symbol \"x\" ");
                System.out.println("Suradnica Riadka");
                x = scanner.nextInt();
                System.out.println("Suradnica Stlpca");
                y = scanner.nextInt();
                if(mapa.checkIfTillIsFree(x,y)){
                    mapa.rewriteMatrix(x,y,'x');
                    break;
                }else{
                    System.out.println("Zadaj suradnice znovu lebo uz je obsadena!!!");
                    continue;
                }
            }

            //vykreslime mapu
            mapa.printMap();

            //teraz overime ci hrac x neni vitaz
            if(mapa.divideMatrix().equals("Nasiel sa vitaz")){
                System.out.println("Vitaz je hrac cislo 2 - x");
                break;
            }

            //ak hrac2 nevyhral
            //pokracujeme s hracom1
            //najprv overime ci je volna dlazdica
            if(!(mapa.isThereAnyFreeSpace())){
                System.out.println("Nie su volne ziadne dlazdice!!!");
                break;
            }


        }



    }

}
