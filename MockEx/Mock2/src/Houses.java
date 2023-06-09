/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public abstract class Houses {

    private String name;
    private String color;

    public Houses(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "House : " + name + " , Color : " + color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
