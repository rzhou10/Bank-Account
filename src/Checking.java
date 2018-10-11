import java.util.*;

class Checking extends Account{
    private int balance = 0;
    private String pin = "";

    Checking(String pin){
        this.pin = pin;
    }

    public String getPin(){
        return pin;
    }

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