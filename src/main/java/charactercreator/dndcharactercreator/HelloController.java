package charactercreator.dndcharactercreator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    public Button classButton;
    public Button hairColorButton;
    public Button nameButton;
    public Button raceButton;
    public Button eyeColorButton;
    public Button pronounButton;

    private final Player player = new Player();

    public void classButton(ActionEvent actionEvent) {
        System.out.println("Class Button Pressed!");
    }

    public void hairButton(ActionEvent actionEvent) {
        System.out.println("Hair Button Pressed!");
    }

    public void nameButton(ActionEvent actionEvent) {
        System.out.println("Name Button Pressed!");
    }

    public void raceButton(ActionEvent actionEvent) {
        System.out.println("Race Button Pressed!");
    }

    public void eyeButton(ActionEvent actionEvent) {
        System.out.println("Eye Button Pressed!");
    }

    public void pronounButton(ActionEvent actionEvent) {
        System.out.println("Pronoun Button Pressed!");
    }
}