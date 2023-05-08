/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public abstract class Bird extends Animal implements Flyable {

    public Bird(String name, int age) {
        setName(name);
        setAge(age);
    }

    public abstract void wingAttack(Animal a);
}
