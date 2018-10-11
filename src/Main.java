import java.util.Scanner;

class Main{
    public static void main(String[] args){
		
        Checking check = new Checking("1234");
        Savings save = new Savings("1234");
        Scanner scan = new Scanner(System.in);

        boolean active = true;

        while (active){
            System.out.println("Please enter your PIN.");
            String num = scan.nextLine();
            
            if (!num.equals(check.getPin())){
                System.out.println("PIN entered incorrectly, please try again.");
            }
            else{
                while (active){
                    System.out.println("Hello, what would you like to do today?");
                    String choice = scan.nextLine();
                    System.out.println();

                    if (choice.equals("Deposit") || choice.equals("deposit")){
                        System.out.println("Which account would you like to deposit in?");
                        String accountType = scan.nextLine();

                        if (accountType.equals("Checking") || accountType.equals("checking") ){
                            System.out.println("Enter the amount to deposit:");
                            String amount = scan.nextLine();
                            check.deposit(amount);
                            System.out.println();
                        }
                        else if (accountType.equals("Savings") || accountType.equals("savings") ){
                            System.out.println("Enter the amount to deposit:");
                            String amount = scan.nextLine();
                            save.deposit(amount);
                            System.out.println();
                        }
                        else{
                            System.out.println("Not a valid account, please try again");
                        }
                        
                    }
                    else if (choice.equals("Withdraw") || choice.equals("withdraw")){
                        System.out.println("Which account would you like to withdraw from?");
                        String accountType = scan.nextLine();
                        
                        if (accountType.equals("Checking") || accountType.equals("checking") ){
                            System.out.println("Enter the amount to withdraw:");
                            String amount = scan.nextLine();
                            check.withdraw(amount);
                            System.out.println();
                        }
                        else if (accountType.equals("Savings") || accountType.equals("savings") ){
                            System.out.println("Enter the amount to withdraw:");
                            String amount = scan.nextLine();
                            save.withdraw(amount);
                            System.out.println();
                        }
                        else{
                            System.out.println("Not a valid account, please try again");
                        }
                    }
                    else if (choice.equals("Leave") || choice.equals("leave")){
                        System.out.println("Thank you for your service. Have a nice day!");
                        scan.close();
                        active = false;
                    }
                    else{
                        System.out.println("Not a valid operation, please try again.");
                    }
                }
            }
        }
        
    }
}