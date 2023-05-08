/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public abstract class Food {

    protected String name;

    public Food() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getPower();
}
