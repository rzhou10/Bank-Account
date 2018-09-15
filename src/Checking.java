import java.util.*;

class Checking extends Account{
    private static int balance = 0;

    public void deposit(String amount){
        balance += Integer.parseInt(amount);
        System.out.println("Deposit successful.");
        System.out.println("Balance is: $" + balance + ".");
    }

    public void withdraw(String amount){
        if (balance < Integer.parseInt(amount)){
            System.out.println("This account has insufficient funds.");
        }
        else{
            balance -= Integer.parseInt(amount);
            System.out.println("Withdraw successful.");
            System.out.println("Balance is: $" + balance + ".");
        }
    }
}