//Jordan Savage
import java.util.*;

public class ATM {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Boolean done = false;
        String enter;
        int with;
        double num;
        SavingsAccount Savings = new SavingsAccount();
        CheckingAccount Checking = new CheckingAccount();
        //greet user
        System.out.println("Greetings, how may I help you");
        System.out.println();
        //loop for main program
        while (!done){
            //ask user what they want to do
            System.out.print("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit? ");
            enter = kb.next();
            switch (enter){
                case "Q":
                case "q":
                    done = true;
                    break;
                case "w":
                case "W":
                    System.out.print("Withdraw from: (1)Checking or (2)Savings? ");
                    with = kb.nextInt();
                    switch (with){
                        case 1:
                            System.out.print("How many credits do you want to withdraw? ");
                            num = kb.nextDouble();
                            if (Checking.getCheckAccount() > num){
                                Checking.withdrawCheckAccount(num);
                            }
                            else {
                                System.out.println("Insufficient funds ");
                            }
                            break;
                        case 2:
                            System.out.print("How many credits do you want to withdraw? ");
                            num = kb.nextDouble();
                            if (Savings.getSaveAccount() > num){
                                Savings.withdrawSaveAccount(num);
                            }
                            else {
                                System.out.println("Insufficient funds ");
                            }
                            break;
                    }
                    break;
                case "D":
                case "d":
                    System.out.print("Deposit to: (1)Checking or (2)Savings? ");
                    with = kb.nextInt();
                    switch (with){
                        case 1:
                            System.out.print("How many credits do you want to deposit? ");
                            num = kb.nextDouble();
                            Checking.addCheckAccount(num);
                            break;
                        case 2:
                            System.out.print("How many credits do you want to deposit? ");
                            num = kb.nextDouble();
                            Savings.addSaveAccount(num);
                            break;
                    }
                    break;

                case "T":
                case "t":
                    System.out.print("Transfer from: (1)Checking to Savings or (2)Savings to Checking? ");
                    with = kb.nextInt();
                    switch (with){
                        case 1:
                            System.out.print("How many credits would you like to transfer? ");
                            num = kb.nextDouble();
                            if (Checking.getCheckAccount() > num){
                                Savings.addSaveAccount(num);
                                Checking.withdrawCheckAccount(num);
                            }
                            else{
                                System.out.println("Insufficient funds ");
                            }
                            break;
                        case 2:
                            System.out.print("How many credits would you like to transfer? ");
                            num = kb.nextDouble();
                            if (Savings.getSaveAccount() > num){
                                Checking.addCheckAccount(num);
                                Savings.withdrawSaveAccount(num);
                            }
                            else{
                                System.out.println("Insufficient funds ");
                            }
                            break;
                    }
                    break;

                case "C":
                case "c":
                    break;

            }
            System.out.println("Your checking account has: " + Checking.getCheckAccount());
            System.out.println("Your Savings account has: " + Savings.getSaveAccount());

        }
        System.out.println("Thank you for using the ATM");

    }
}