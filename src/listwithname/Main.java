package listwithname;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("Janko", "Novotny", 22, 'm');
        Person person2 = new Person("Dusan", "Novotny", 28, 'm');
        Person person3 = new Person("Milana", "Novotna", 29, 'f');
        Person person4 = new Person("Ruzena", "Nova", 88, 'f');
        Person person5 = new Person("Jarmila", "Nova", 11, 'f');
        Person person6 = new Person("Gustav", "Novotny", 67, 'm');
        Person person7 = new Person("Peter", "Novotny", 28, 'm');
        Person person8 = new Person("Zuzana", "Alicka", 20, 'f');
        Person person9 = new Person("Vilko", "Gasparovsky", 55, 'm');
        Person person10 = new Person("Honza", "Lenkavsky", 43, 'm');
        Person person11 = new Person("Agata", "Nova", 45, 'f');
        Person person12 = new Person("Agata", "Nova", 45, 'f');
        Person person13 = new Person("Rudolf", "Adamkovic", 45, 'm');
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);
        list.add(person7);
        list.add(person8);
        list.add(person9);
        list.add(person10);
        list.add(person11);
        list.add(person12);
        list.add(person13);

        System.out.println("1. ---");
        //1uloha cez forech prejst
        list.forEach(m->m.printFirstLetterAndSurname());

        System.out.println("2. ---");
        //2uloha ziskat zeny
        List<Person> list1 = Person.getAllFemale(list);
        list1.forEach(m->m.printFirstLetterAndSurname());

        System.out.println("3. ---");
        //sortovanie na zaklade veku
        Person.sortListAccordingToTheAge(list);
        list.forEach(m->m.printFirstLetterAndSurnameAndAge());

        System.out.println("4. ---");
        //sortovanie na zaklade priezviska abecedne
        //ak su rovanke priezviska tak nech berie mena
        Person.sortListAccordingToTheSurname(list);
        list.forEach(m->m.printFirstLetterAndSurnameAndAge());
    }


}
