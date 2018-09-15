class Savings extends Account{
    private static int balance = 0;
    private static int withdrawLimit = 0;

    public void deposit(String amount){
        balance += Integer.parseInt(amount);
        System.out.println("Deposit successful.");
        System.out.println("Balance is: $" + balance + ".");
    }

    public void withdraw(String amount){
        if (withdrawLimit >= 3){
            System.out.println("You have reached the maximum withdrawals for this month, please try again.");
            return;
        }
        if (balance < Integer.parseInt(amount)){
            System.out.println("This account has insufficient funds.");
        }
        else if (Integer.parseInt(amount) > 50){
            System.out.println("Amount to withdraw must not exceed $50.");
        }
        else{
            balance -= Integer.parseInt(amount);
            System.out.println("Withdraw successful.");
            System.out.println("Balance is: $" + balance + ".");
            withdrawLimit++;
        }
    }
}