public class SavingsAccount{

    //instance variables
    double balance;

    //constructors
    public SavingsAccount()
    {
        balance = 100.00;
    }

    //methods
    public double getSaveAccount(){
        return balance;
    }
    public double addSaveAccount(double x){
        balance += x;
        return balance;
    }
    public double withdrawSaveAccount(double x){
        balance -= x;
        return balance;
    }
}