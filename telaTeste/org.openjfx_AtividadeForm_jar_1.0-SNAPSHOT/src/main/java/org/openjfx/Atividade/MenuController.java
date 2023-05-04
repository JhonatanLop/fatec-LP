package org.openjfx.atividade;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Popup;
import javafx.stage.Stage;

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
    void openTicket(ActionEvent event) throws IOException {
        // Popup popup = (Popup) ticket.getScene().getWindow();
        // popup.hide();
        // App.showPopup("ticket");

        Parent root = FXMLLoader.load(getClass().getResource("ticket.fxml"));
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.setTitle("Ticket");
        stage.setScene(scene);
        stage.show();
    }
}