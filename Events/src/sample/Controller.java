package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Controller {
    @FXML
    private TextField nameField;

    @FXML
    public void onButtonClicked(ActionEvent e) {

        System.out.println("Hello, " + nameField.getText());
        System.out.println("The following button was clicked " + e.getSource());
    }
}
