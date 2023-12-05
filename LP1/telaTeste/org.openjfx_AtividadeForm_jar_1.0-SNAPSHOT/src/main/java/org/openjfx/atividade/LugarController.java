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
        String lugarnome = nomeLugar.getText();
        String lugarpais = pais.getText();
        String lugarestado = estado.getText();
        String lugarcidade = cidade.getText();

        Lugar lugar = new Lugar(lugarnome,lugarpais,lugarestado,lugarcidade);
        Ticket.setLugar(lugar);
        System.out.println("\n\n\n deu bom caraio");
    }
}
