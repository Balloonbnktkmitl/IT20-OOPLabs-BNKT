/*
 *  IG: i_am_bnkt
 */

public class Wizard extends Person{
    public Wizard(){
        this("", null, null);
    }
    public Wizard(String name, CheckingAccount myAcct, Item myItem){
        super(name, myAcct, myItem);
        System.out.println("My name is " + this.getName() + " in Wizard class.");
    }
    public void buyItem(Person m){
        if (pay(m, )){
            ((Merchant) m).sellItem(m);
            System.out.println("[Wizard] I got it.");
        }
        else{
            System.out.println("[Wizard] Failed Trade.");
        }
    }
    public boolean pay(Person m, double p){
        if (m.getMyAcct().withdraw(p)){
            ((Merchant) m).collectMoney(m, p);
            System.out.println("[Wizard] - I have paid the item fees to " + m.getName());
            return true;
        }
        else{
            System.out.println("[Wizard] - I donot have enough money.");
            return false;
        }
    }
    
    @Override
    public String getInfo(){
        return "[Wizard] - My name is " + this.getName() + ". "+ this.getMyAcct() + " " + this.getItem();
    }
}
