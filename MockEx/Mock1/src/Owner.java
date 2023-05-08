/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Owner {

    protected final String name;
    protected Animal animal;

    public Owner() {
        this("", null);
    }

    public Owner(String name) {
        this(name, null);
    }

    public Owner(Animal animal) {
        this("", animal);
    }

    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void feedFood(Food f) {
        animal.eat(f);
    }

    @Override
    public String toString() {
        return "Owner : name = " + getName() + ", Animal : name = " + animal.getName() + ", power = " + animal.getPower() + ", age = " + animal.getAge();
    }

    public void protectOwnerFrom(Animal a) {
        if (getAnimal() instanceof Dog) {
            ((Dog) getAnimal()).kick(a);
        } else if (getAnimal() instanceof Pigeous) {
            ((Pigeous) getAnimal()).wingAttack(a);
        }
    }
}
