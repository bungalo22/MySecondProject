package practice.tasksCl;

public class BankAccount {
   int id = 10;
   String name = "Dima";
   double balance = 100;

   void popolnenieScheta (double summaPopolneniya) {
       System.out.println("Баланс до пополнения счета: " + balance);
       System.out.println("Баланс пополнился на: " + summaPopolneniya);
       balance += summaPopolneniya;
       System.out.println("Баланс после пополнения счета: " + balance);
       System.out.println();
   }
    void sniatyeSoScheta (double summaSniatiya) {
        System.out.println("Баланс до снятия со счета: " + balance);
        System.out.println("Баланс уменьшился на: " + summaSniatiya);
        balance -= summaSniatiya;
        System.out.println("Баланс после снятия со счета: " + balance);
    }
}

class Ba {
    public static void main(String[] args) {
        BankAccount myAccaunt = new BankAccount();
        myAccaunt.popolnenieScheta(20.5);
        myAccaunt.sniatyeSoScheta(50);
    }
}
