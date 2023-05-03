package org.openjfx.atividade;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ViagemController {

    @FXML
    private Button cadViagem;

    @FXML
    private DatePicker dataChegada;

    @FXML
    private DatePicker dataPartida;

    @FXML
    private TextField documentoViajante;

    @FXML
    private Button limpar;

    @FXML
    private TextField localChegada;

    @FXML
    private TextField localPartida;

    @FXML
    private TextField nomeViajante;

    @FXML
    private TextField transporte;

    @FXML
    private Button voltar;

    @FXML
    void cadViagem(ActionEvent event) {

    }

    @FXML
    void cleanFields(ActionEvent event) {
        localPartida.clear();
        localChegada.clear();
        nomeViajante.clear();
        transporte.clear();
        dataPartida.setPromptText("dd/mm/yyyy");
        dataChegada.setPromptText("dd/mm/yyyy");
        documentoViajante.clear();
    }

    @FXML
    void goBack(ActionEvent event) {
        App.changeView("menu");
    }
}
