/*
 *  IG: i_am_bnkt
 */

public class Item {
    private String name;
    private double price;
    public Item(){
        this("", 0);
    }
    public Item(String name, double price){
        this.name = name; 
        this.price = price;
        System.out.println("Item name " + this.name + " is equal to " + this.price + " baht. ");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " price " + this.price + " baht.";
    }
    
}
