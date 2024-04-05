import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        int j = new Scanner(System.in).nextInt();
        int x = 1;

        for (int i = 1; i <= j; i++) {
            x = x * i;
            //System.out.println("Факториал числа " + i + " = " + x);
        }
            System.out.println("Факториал числа " + j + " = " + x);
    }
}
