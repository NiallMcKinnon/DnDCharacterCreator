package charactercreator.dndcharactercreator;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class CharacterController implements Initializable {

    private final Player player = new Player();
    public TextField nameField;
    public Button updateButton;
    public ColorPicker hairColorPicker;
    public ChoiceBox<String> pronounMenu;
    private final String[] pronounChoices = {"he/him", "she/her", "they/them"};
    public ChoiceBox<String> raceMenu;
    private final String[] raceChoices = {"Elf", "Human"};
    public ColorPicker eyeColorPicker;
    public ChoiceBox<String> classMenu;
    private final String[] classChoices = {"Never", "Gonna", "Give", "You", "Up"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pronounMenu.getItems().addAll(pronounChoices);
        raceMenu.getItems().addAll(raceChoices);
        classMenu.getItems().addAll(classChoices);
        // Placeholder for live updating in the future:
        //pronounMenu.setOnAction(this::<method>);
    }

    public void updateButtonPressed(ActionEvent actionEvent) {

        player.setName(nameField.getText());
        player.setPronouns(pronounMenu.getValue());
        player.setRace(raceMenu.getValue());
        player.setPlayerClass(classMenu.getValue());
        player.setEyeColor(String.valueOf(eyeColorPicker.getValue()));
        player.setHairColor(String.valueOf(hairColorPicker.getValue()));

        System.out.println(player);
    }


}
