package org.openjfx.travel.controllers;

import java.io.IOException;

import org.openjfx.travel.App;

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
    void SwitchToViagens(ActionEvent event) {
        try {
            App.setRoot("viagens");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - viagens.fxml");
            e.printStackTrace();
        }
    }
    
    @FXML
    void switchToHome(ActionEvent event) {
        try {
            App.setRoot("primary");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - primary.fxml");
            e.printStackTrace();
        }
    }

    @FXML
    void switchToLocais(ActionEvent event) {
        try {
            App.setRoot("locais");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - locais.fxml");
            e.printStackTrace();
        }
    }
    
    @FXML
    void switchToPassageiros(ActionEvent event) {
        try {
            App.setRoot("passageiros");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - passageiros.fxml");
            e.printStackTrace();
        }
    }

    @FXML
    void switchToVeiculos(ActionEvent event) {
        try {
            App.setRoot("veiculos");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - veiculos.fxml");
            e.printStackTrace();
        }
    }

    @FXML
    void ButtonCancelar(ActionEvent event) {

    }
    
    @FXML
    void buttonImprimir(ActionEvent event) {
        
    }

    @FXML
    void selectViagem(ActionEvent event) {
        
    }
    
}
