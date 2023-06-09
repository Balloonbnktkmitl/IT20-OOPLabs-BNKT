/*
 *  IG: i_am_bnkt
 */

public abstract class Person {
    private String name;
    private CheckingAccount myAcct;
    private Item myItem;
    public Person(){
        this("", null, null);
    }
    public Person(String name, CheckingAccount myAcct, Item myItem){
        this.name = name;
        this.myAcct = myAcct;
        this.myItem = myItem;
        System.out.println("My name is " + this.name + " in Person class.");
    }
    public abstract String getInfo();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setItem(Item myItem) {
        this.myItem = myItem;
    }

    public Item getItem() {
        return myItem;
    }

    public void setMyAcct(CheckingAccount myAcct) {
        this.myAcct = myAcct;
    }

    public CheckingAccount getMyAcct() {
        return myAcct;
    }
    
    
}
