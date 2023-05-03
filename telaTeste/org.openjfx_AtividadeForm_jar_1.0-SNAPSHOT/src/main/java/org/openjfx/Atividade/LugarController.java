package org.openjfx.atividade;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LugarController {

    @FXML
    private TextField cidade;

    @FXML
    private Button clean;

    @FXML
    private Button enviarCadastro;

    @FXML
    private TextField estado;

    @FXML
    private TextField nomeLugar;

    @FXML
    private TextField pais;

    @FXML
    void cleanField(ActionEvent event) {
        cidade.clear();
        estado.clear();
        nomeLugar.clear();
        pais.clear();
    }

    @FXML
    void goBack(ActionEvent event) {
        App.changeView("menu");
    }

    @FXML
    void sendCad(ActionEvent event) {
        String lugarnome = nomeLugar.toString();
        String lugarpais = pais.toString();
        String lugarestado = estado.toString();
        String lugarcidade = cidade.toString();
        Lugar lugar = new Lugar(lugarnome,lugarpais,lugarestado,lugarcidade);
    }

}
