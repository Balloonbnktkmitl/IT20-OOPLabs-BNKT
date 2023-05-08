/*
 *  IG: i_am_bnkt
 */


public class Merchant extends Person{
    public Merchant(){
        this("", null, null);
    }
    public Merchant(String name, CheckingAccount myAcct, Item myItem){
        super(name, myAcct, myItem);
        System.out.println("My name is " + name + " in Merchant class.");
    }
    public Item sellItem(Person w){
        if (pay(w, ) == true){
            setItem(null);
            System.out.println("[Merchant] - Exchange Complete.");
            return getItem();
        }
        else{
            System.out.println("[Merchant] - Exchange Incomplete.");
        }
    }
    public boolean collectMoney(Person w, double p){
        if (getMyAcct().deposit(p)){
            System.out.println("[Merchant] - I got " + w.getName() + " money " + "([" + p + "]).");
            return true;
        }
        else{
            System.out.println("[Merchant] - " + w.getName() + " is not enough money.");
            return false;
        }
    }
    @Override
    public String getInfo(){
        return "[Merchant] - My name is " + this.getName() + ". "+ this.getMyAcct() + " " + this.getItem();
    }
}
