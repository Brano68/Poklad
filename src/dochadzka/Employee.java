package dochadzka;

public class Employee {
    private String name;
    int cislo;

    public Employee(String name, int cislo){
        this.name = name;
        this.cislo = cislo;
    }

    public String getName() {
        return name;
    }

    public int getCislo() {
        return cislo;
    }
}
