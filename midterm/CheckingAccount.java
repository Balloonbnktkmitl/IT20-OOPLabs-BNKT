/*
 *  IG: i_am_bnkt
 */


public class CheckingAccount extends Account implements WithdrawAble{
    private static double Rate;
    public CheckingAccount(){
        this.balance = 0;
        this.name = "";
        setRate(0.1);
    }
    public CheckingAccount(double balance, String name){
        this.balance = balance;
        this.name = name;
        setRate(0.1);
        System.out.println(this.name + " has successfully opened a checking account with a balance of " + this.balance + " baht and its rate is " + getRate() + " in the account.");
    }

    public static void setRate(double Rate) {
        CheckingAccount.Rate = Rate;
    }

    public static double getRate() {
        return Rate;
    }
    public void showInterest(){
        double interest = this.balance * getRate() * 1;
        System.out.println("I get interest " + interest + " baht");
    }
    public void showInterest(int year){
        double interest = this.balance * getRate() * year;
        System.out.println("I get interest " + interest + " baht");
    }
    @Override
    public void getInfoAcct(){
        System.out.println(this.name + " checking account has " + this.balance + " Baht.");
    }
    @Override
    public boolean deposit(double a){
        if (a > 0){
            this.setBalance(this.getBalance() + a);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean withdraw(double a) {
        if (balance - a < 0){
            System.out.println("[CA] Transaction fail.");
            return false;
        }
        if (a < 0){
            System.out.println("Not support zero or negative number.");
            return false;
        }
        else{
            this.setBalance(this.getBalance() - a);
            System.out.println("[CA] Transaction success.");
            return true;
        }
    }
          
}
