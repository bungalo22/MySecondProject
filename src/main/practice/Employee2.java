package practice;

public class Employee2 {
    public static void main(String[] args) {
        Employee employee = new Employee(2, "Danil", 23, 2500, "Roading");
        Employee employee1 = new Employee(65, "Kristina", 25, 5000,"Building");



        System.out.println("Зарплата " + employee.surname + ": " + employee.salary);
        System.out.println("Зарплата выросла " + employee.surname + ": " + employee.getSalary());

        System.out.println("Зарплата " + employee1.surname + ": " + employee1.salary);
        System.out.println("Зарплата выросла " + employee1.surname + ": " + employee1.getSalary());
    }
}
