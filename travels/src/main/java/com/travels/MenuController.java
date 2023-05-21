package com.travels;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {

    @FXML
    private Button PassageirosId;

    @FXML
    private Button locaisId;

    @FXML
    private Button passagensId;

    @FXML
    private Button veiculosId;

    @FXML
    private Button viagensId;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
