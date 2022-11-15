module charactercreator.dndcharactercreator {
    requires javafx.controls;
    requires javafx.fxml;


    opens charactercreator.dndcharactercreator to javafx.fxml;
    exports charactercreator.dndcharactercreator;
}