/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public abstract class Animal {

    static String getAnimal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String name;
    private int power;
    private int age;

    public Animal() {
        this("", 0, 0);
    }

    public Animal(String name, int power, int age) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean equals(Animal a) {
        return ((a.getName().equals(this.getName())) && (a.getAge() == this.getAge()));
    }

    @Override
    public String toString() {
        return "Animal : name = " + getName() + ", power = " + getPower() + ", age = " + getAge();
    }

    public abstract void eat(Food f);

    Object setPower() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
