package arrayList;

import java.util.*;

public class Cviko {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(68);
        list.add(88);
        list.add(1000);
/*
        //1sposob for
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println("\n---");

        //2sposob foreach
        for(Integer i : list){
            System.out.print(i+" ");
        }

        System.out.println("\n---");

        //3sposob while
        int j = 0;
        while(j<list.size()){
            System.out.print(list.get(j) + " ");
            j++;
        }
        System.out.println("\n---");

        //4sposob iterator
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println("\n---");

        //5sposob do while
        int k = 0;
        do{
            System.out.print(list.get(k)+" ");
            k++;
        }while(k<list.size());
        System.out.println("\n---");

        //6sposob sout
        System.out.println(list);
        System.out.println("\n---");

        //7sposob
        list.forEach((n)->{
            System.out.println(n);
        });

        //8sposob
        list.forEach(Cviko::write);
        System.out.println("---");

        //vypis od najmensieho po najvacsie
        int[] pole = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            pole[i] = list.get(i);
        }

        Arrays.sort(pole);

        for(int i = 0; i < pole.length; i++){
            System.out.print(pole[i] + " ");
        }
        System.out.println("\n---");
        //zoradenie ->
        Collections.sort(list);
        System.out.print(list);

        System.out.println("\n---");
        //zoradenie <-
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        //usporiadanie cisel v poli podla vlastneho kriteria
        //ciferny sucet
*/
        Collections.sort(list, (o1, o2) -> {
            int cs1 = digitSum(o1);
            int cs2 = digitSum(o2);
            System.out.println(cs1 + " " + cs2);
            if(cs1==cs2){
                return 0;
            }else if(cs1>cs2){
                return + 1;
            }else{
                return -1;
            }
        });

        System.out.println("****");
        System.out.println(list);


        //System.out.println(digitSum(-4587));


        //list.forEach(Cviko::power2);


        List<String> listOfString = new ArrayList<>();
        listOfString.add("Jozk");
        listOfString.add("Palko");
        listOfString.add("Idem Vonka");
        listOfString.add("za");
        listOfString.add("e");
        listOfString.add("for");

        System.out.println(listOfString);

        Collections.sort(listOfString, (o1, o2) -> {
            int cs1 = lengthOfString(o1);
            int cs2 = lengthOfString(o2);
            System.out.println(cs1 + " " + cs2);
            if(cs1==cs2){
                return 0;
            }else if(cs1>cs2){
                return + 1;
            }else{
                return -1;
            }
        });

        System.out.println(listOfString);
    }

    private static int digitSum(int value){
        value = Math.abs(value);
        int result = 0;
        while(value>0){
            result += value%10;
            value /=10;
        }
        return result;
    }

    public static void write(int m){
        System.out.println(m + " ");
    }

    public static void power2(int m){
        System.out.println(m*m);
    }


    private static int lengthOfString(String word){
        return word.length();
    }

}
