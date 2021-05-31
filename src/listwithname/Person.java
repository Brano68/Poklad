package listwithname;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        System.out.println(this.getfName().substring(0,1) + ". " + this.getlName());
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
            String cs1 = o1.getlName();
            String cs2 = o2.getlName();
            //System.out.println(cs1 + " " + cs2);
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


}
