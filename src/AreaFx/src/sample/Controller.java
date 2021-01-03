package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField txtWidth;

    @FXML
    private TextField txtHeight;

    @FXML
    private TextField txtArea;

    @FXML
    public void calcButtonClicked(ActionEvent event) {
        double width, height;
        width = Double.parseDouble(txtWidth.getText());
        height = Double.parseDouble(txtHeight.getText());
        txtArea.setPromptText(Area.rectangle(width, height) + "");
    }
}
