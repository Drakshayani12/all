package practice.AccountAccessModifierQuestion;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Account acc = new Account("P123456", 1000.0);
        System.out.println("Account number: "+acc.getAccountNumber());
        System.out.println("Initial balance in account: "+acc.getBalance());

        //deposit 500.0
        acc.deposit(500.0);

        System.out.println("Balance after deposit: "+acc.getBalance());

        //withdraw 800.0
        acc.withdraw(800.0);

        System.out.println("Balance after withdrawal: "+acc.getBalance());
    }
}
