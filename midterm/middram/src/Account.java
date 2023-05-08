/*
 *  IG: i_am_bnkt
 */

public abstract class Account implements DepositAble{
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
        System.out.println(this.name + " has successfully opened a deposit account with a balance of " + this.balance + " baht in the account.");
    }
    @Override
    public String toString(){
        return "Account balance is qual to "+ this.balance + " baht.";
    }
    public abstract void getInfoAcct();

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
}
