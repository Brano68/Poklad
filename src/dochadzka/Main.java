package dochadzka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", 125986);
        Employee employee2 = new Employee("Peter", 0);
        SystemDochadzkovy systemDochadzkovy = new SystemDochadzkovy();
        systemDochadzkovy.addEmplyee(employee1);
        systemDochadzkovy.addEmplyee(employee2);

        System.out.println("Zadaj den ktory chces zistit ci boli ludia v praci");
        Scanner scanner = new Scanner(System.in);
        int den = scanner.nextInt();
        systemDochadzkovy.findItOut(den);

        System.out.println("---");

        System.out.println("Zadaj cislo dna kedy chces aby bol v robote");
        den = scanner.nextInt();
        systemDochadzkovy.change(den);

        System.out.println("---");
        System.out.println("Zadaj cislo dna kedy chces zistit ci bol v robote");
        den = scanner.nextInt();
        systemDochadzkovy.findItOut(den);

    }
}
