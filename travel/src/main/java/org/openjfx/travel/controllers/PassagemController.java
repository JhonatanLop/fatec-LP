package org.openjfx.travel.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PassagemController {

    @FXML
    private DatePicker dataPartida;

    @FXML
    private DatePicker dataVolta;

    @FXML
    private TextField destinoViagem;

    @FXML
    private ListView<?> listPassageiros;

    @FXML
    private TextField origemViagem;

    @FXML
    private TextField transpIda;

    @FXML
    private TextField transpVolta;

    @FXML
    private TextField viagemId;

    
    @FXML
    void ButtonCancelar(ActionEvent event) {

    }
    
    @FXML
    void buttonImprimir(ActionEvent event) {
        
    }

    @FXML
    void SwitchToViagens(ActionEvent event) {
        
    }
    
    @FXML
    void selectViagem(ActionEvent event) {

    }
    
    @FXML
    void switchToHome(ActionEvent event) {

    }

    @FXML
    void switchToLocais(ActionEvent event) {
        
    }
    
    @FXML
    void switchToPassageiros(ActionEvent event) {
        
    }

    @FXML
    void switchToVeiculos(ActionEvent event) {

    }
}
