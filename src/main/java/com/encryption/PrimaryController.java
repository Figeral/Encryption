package com.encryption;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    TextField a;
    @FXML
    TextField b;
    @FXML
    TextField c;
    @FXML
    TextField d;
    @FXML
    private Label result;
    @FXML
    private TextField clairtext;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    public void encryption() {
        result.setText(Hill.encryption(clairtext.getText().toUpperCase(), a, b, c, d));
    }
}
