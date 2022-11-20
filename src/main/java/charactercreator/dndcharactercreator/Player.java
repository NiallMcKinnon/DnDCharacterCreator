package charactercreator.dndcharactercreator;

public class Player {

    private String hairColor, eyeColor, name, pronouns, race, playerClass;

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Player() {

    }

    @Override
    public String toString() {
        return "Player{" +
                "hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", name='" + name + '\'' +
                ", pronouns='" + pronouns + '\'' +
                ", race='" + race + '\'' +
                '}';
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
}
