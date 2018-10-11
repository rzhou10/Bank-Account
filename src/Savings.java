class Savings extends Account{
    private int balance = 0;
    private int withdrawLimit = 0;
    private String pin = "";

    Savings(String pin){
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