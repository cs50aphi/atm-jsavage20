public class CheckingAccount{

    //instance variables
    double balance;

    //constructors
    public CheckingAccount()
    {
        balance = 100.00;
    }

    //methods
    public double getCheckAccount(){
        return balance;
    }
    public double addCheckAccount(double x){
        balance += x;
        return balance;
    }
    public double withdrawCheckAccount(double x){
        balance -= x;
        return balance;
    }
}