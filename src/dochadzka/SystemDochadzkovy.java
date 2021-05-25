package dochadzka;

import java.util.HashMap;
import java.util.Map;

public class SystemDochadzkovy {

    Map<String, Integer> map;

    public SystemDochadzkovy(){
        map = new HashMap<>();
    }

    public void addEmplyee(Employee employee){
        map.put(employee.getName(),employee.getCislo());
    }

    public void findItOut(int den){
        den = den - 1;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Meno: " + entry.getKey());

            if((entry.getValue() & (int)Math.pow(2,den))>0){
                System.out.println("Bol v praci");
            }else{
                System.out.println("Nebol v praci");
            }

            System.out.println();

        }
    }


    public void change(int den){
        den = den - 1;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            map.put(entry.getKey(), (entry.getValue() | (int)Math.pow(2,den)));
        }

    }

}
