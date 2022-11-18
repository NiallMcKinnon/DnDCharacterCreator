package charactercreator.dndcharactercreator;

public class Player {

    private String hairColor, eyeColor, name, pronouns;
    private int height; // Could be cm or inches

    // RACE: Does this warrant a subclass?

    public Player() {

    }

    public Player(String hairColor, String eyeColor, String name, String pronouns, int height) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.name = name;
        this.pronouns = pronouns;
        this.height = height;
    }

    // In the GUI we can restrict the options based on drop-down menus etc.

    public String getPronouns() {return pronouns;}

    public void setPronouns(String pronouns) {this.pronouns = pronouns;}

    public String getHairColor() {return hairColor;}

    public void setHairColor(String hairColor) {this.hairColor = hairColor;}

    public String getEyeColor() {return eyeColor;}

    public void setEyeColor(String eyeColor) {this.eyeColor = eyeColor;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getHeight() {return height;}

    public void setHeight(int height) {this.height = height;}
}
