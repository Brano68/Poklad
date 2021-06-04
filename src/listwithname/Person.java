package listwithname;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Person {
    private String fName;
    private String lName;
    private int age;
    private char gender;

    public Person(String fName, String lName, int age, char gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }


    public void printFirstLetterAndSurname(){
        System.out.println(this.getfName().substring(0,1) + ". " + this.getlName() + " HashCode: " + this.hashCode());
    }

    public void printFirstLetterAndSurnameAndAge(){
        System.out.println(this.getfName().substring(0,1) + ". " + this.getlName()+ " " + this.getAge());
    }

    public static List<Person> getAllFemale(List<Person> allMembers){
        List<Person> list= new ArrayList<>();
        for(Person p : allMembers){
            if(p.getGender() == 'f'){
                list.add(p);
            }
        }
        return list;
    }

    public static void sortListAccordingToTheAge(List<Person> list){
        Collections.sort(list, (o1, o2) -> {
            int cs1 = o1.getAge();
            int cs2 = o2.getAge();
            //System.out.println(cs1 + " " + cs2);
            if(cs1==cs2){
                return 0;
            }else if(cs1>cs2){
                return + 1;
            }else{
                return -1;
            }
        });
        //System.out.println(list);
    }

    public static void sortListAccordingToTheSurname(List<Person> list){
        Collections.sort(list, Collections.reverseOrder((o1, o2) -> {
            //String cs1 = o1.getlName();
            //String cs2 = o2.getlName();
            //System.out.print(cs1 + " " + cs2 + " ");
            if(compareName1(o1,o2) == 0){
                return 0;
            }else if(compareName1(o1,o2) == 1){
                return + 1;
            }else{
                return -1;
            }
        }));
        //System.out.println(list);
    }

    /*
    private static int compareName(Person p1, Person p2){
        //v pripade ked budu rovanke priezviska
        if(p1.getlName().equals(p2.getlName())){
            String name1 = p1.getfName().toLowerCase();
            String name2 = p2.getfName().toLowerCase();
            if(name1.length()<name2.length()){
                for(int i = 0; i < name1.length(); i++){
                    if(name1.charAt(i)==name2.charAt(i)){
                        continue;
                    }else if(name1.charAt(i)<name2.charAt(i)){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }else{
                for(int i = 0; i < name2.length(); i++){
                    if(name1.charAt(i)==name2.charAt(i)){
                        continue;
                    }else if(name1.charAt(i)<name2.charAt(i)){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        }

        //v priapade ze neboli priezviska rovnake
        String name1 = p1.getlName().toLowerCase();
        String name2 = p2.getlName().toLowerCase();
        if(name1.length()<name2.length()){
            for(int i = 0; i < name1.length(); i++){
                if(name1.charAt(i)==name2.charAt(i)){
                    continue;
                }else if(name1.charAt(i)<name2.charAt(i)){
                    return 1;
                }else{
                    return -1;
                }
            }
        }else{
            for(int i = 0; i < name2.length(); i++){
                if(name1.charAt(i)==name2.charAt(i)){
                    continue;
                }else if(name1.charAt(i)<name2.charAt(i)){
                    return - 1;
                }else{
                    return 1;
                }
            }
        }

        return 0;
    }
    */

    private static int compareName1(Person p1, Person p2){

        //v pripade ked budu rovanke priezviska
        if(p1.getlName().equals(p2.getlName())){
            String name1 = p1.getfName().toLowerCase();
            String name2 = p2.getfName().toLowerCase();
            if(name1.length()<name2.length()){
                for(int i = 0; i < name1.length(); i++){
                    if(name1.charAt(i)==name2.charAt(i)){
                        continue;
                    }else if(name1.charAt(i)<name2.charAt(i)){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }else{
                for(int i = 0; i < name2.length(); i++){
                    if(name1.charAt(i)==name2.charAt(i)){
                        continue;
                    }else if(name1.charAt(i)<name2.charAt(i)){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        }



        //v priapade ze neboli priezviska rovnake
        String name1 = p1.getlName().toLowerCase();
        String name2 = p2.getlName().toLowerCase();
        if(name1.length()<name2.length()){
            for(int i = 0; i < name1.length(); i++){
                if(name1.charAt(i)==name2.charAt(i)){
                    continue;
                }else if(name1.charAt(i)<name2.charAt(i)){
                    return 1;
                }else{
                    return -1;
                }
            }
        }else{
            for(int i = 0; i < name2.length(); i++){
                if(name1.charAt(i)==name2.charAt(i)){
                    continue;
                }else if(name1.charAt(i)<name2.charAt(i)){
                    return 1;
                }else{
                    return -1;
                }
            }
        }

        return 0;
    }

    public int hashCode(){
        String result = "";
        for(int i = 0; i < lName.length(); i++){
            if(lName.toLowerCase().charAt(i) ==  'b' || lName.toLowerCase().charAt(i) == 'c'  ||
                    lName.toLowerCase().charAt(i) == 'd' || lName.toLowerCase().charAt(i) == 'f' ||
                    lName.toLowerCase().charAt(i) == 'g' || lName.toLowerCase().charAt(i) == 'h' ||
                    lName.toLowerCase().charAt(i) == 'j' || lName.toLowerCase().charAt(i) == 'k' ||
                    lName.toLowerCase().charAt(i) == 'l' || lName.toLowerCase().charAt(i) == 'm' ||
                    lName.toLowerCase().charAt(i) == 'n' || lName.toLowerCase().charAt(i) == 'p' ||
                    lName.toLowerCase().charAt(i) == 'q' || lName.toLowerCase().charAt(i) == 'r' ||
                    lName.toLowerCase().charAt(i) == 's' || lName.toLowerCase().charAt(i) == 't' ||
                    lName.toLowerCase().charAt(i) == 'v' || lName.toLowerCase().charAt(i) == 'w' ||
                    lName.toLowerCase().charAt(i) == 'x' || lName.toLowerCase().charAt(i) == 'z'){
                result += 1;
            }else{
                result += 0;
            }
        }
        return Integer.parseInt(result,2);
    }

    public static List<Person> under18Years(List<Person> list){
        List<Person> list1 = new ArrayList<>();
        for(Person p : list){
            if(p.getAge()<=18){
                list1.add(p);
            }
        }
        return list1;
    }


}
