package practice;

public class OverLoad {

    int calculateSum() {
        int sum = 0;
        System.out.println("Сумма: " + sum);
        return sum;
    }

    int calculateSum(int a) {
        int sum = a;
        System.out.println("Сумма: " + sum);
        return sum;
    }

    int calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("Сумма: " + sum);
        return sum;
    }

    void calculateSum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Сумма: " + sum);
    }

    void calculateSum(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println("Сумма: " + sum);
    }

    public static void main(String[] args) {
        OverLoad calculator = new OverLoad();
        calculator.calculateSum();
        calculator.calculateSum(1);
        calculator.calculateSum(1, 10);
        calculator.calculateSum(1, 12, 4);
        calculator.calculateSum(1, 12, 3, 20);


    }
}
