package org.openjfx.Atividade;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VeiculosController {
    @FXML
    private TextField ano;

    @FXML
    private Button clean;

    @FXML
    private Button enviarCadastro;

    @FXML
    private Button goBack;

    @FXML
    private TextField marca;

    @FXML
    private TextField modelo;

    @FXML
    private TextField tipo;

    @FXML
    void cleanField(ActionEvent event) {
        ano.clear();
        marca.clear();
        modelo.clear();
        tipo.clear();
    }

    @FXML
    void goBack(ActionEvent event) {

    }

    @FXML
    void sendCad(ActionEvent event) {

    }

}
