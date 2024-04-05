package Emp;

public class Emp {
    int id;
    public String surname;
    int age;
    private  double salary;
    String department;
    String name;

    public Emp(int id) {
        this.id = id;
    }

    Emp(String surname) {
        this.surname = surname;
    }

    private Emp(double salary) {
        this.salary = salary;
    }

    public void getId() {
        System.out.println("ID = " + id);
    }

    public void getSurname() {
        System.out.println("SURENAME = " + surname);
    }

    public void getSalary() {
        System.out.println("SALARY = " + salary);
    }
    public double ho() {
        this.salary *= 2;
        return salary;
    }

    public static void main(String[] args) {
        Emp emp2 = new Emp(200.2);
        Emp emp = new Emp(2);
        Emp emp3 = new Emp("ddff");
        System.out.println(emp2.salary);
        System.out.println(emp2.surname);
        System.out.println(emp2.id);
        emp2.getSalary();
    }
}

