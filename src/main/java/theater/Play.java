package theater;

/**
 * File represents a play with a name and type.
 * @null This class doesn't allow null values for any of the constructor arguments or fields.
 */

public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
