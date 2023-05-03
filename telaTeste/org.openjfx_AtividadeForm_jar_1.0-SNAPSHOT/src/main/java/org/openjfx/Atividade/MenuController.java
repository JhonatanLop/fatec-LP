package org.openjfx.atividade;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Popup;

public class MenuController {

    @FXML
    private Button cadLugares;

    @FXML
    private Button cadPessoas;

    @FXML
    private Button cadVeiculos;

    @FXML
    private Button cadViagens;

    @FXML
    private Button ticket;

    @FXML
    void cadLugares(ActionEvent event) {
        App.changeView("cadastroLocal");
    }
    
    @FXML
    void cadPessoas(ActionEvent event) {
        App.changeView("cadastroPessoas");
    }
    
    @FXML
    void cadVeiculos(ActionEvent event) {
        App.changeView("cadastroVeiculos");
    }

    @FXML
    void cadViagens(ActionEvent event) {
        App.changeView("cadastroViagens");
    }

    @FXML
    void openTicket(ActionEvent event) {
        Popup popup = (Popup) ticket.getScene().getWindow();
        popup.hide();
    }

}