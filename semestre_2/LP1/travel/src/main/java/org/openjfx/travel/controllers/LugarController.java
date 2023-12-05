package org.openjfx.travel.controllers;

import java.io.IOException;

import org.openjfx.travel.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LugarController {
    
    @FXML
    private Button PassageirosId;

    @FXML
    private TextField banheirosId;

    @FXML
    private TextField cafeId;

    @FXML
    private Button canceId;

    @FXML
    private TextField cepId;

    @FXML
    private TextField cidadeId;

    @FXML
    private Button enviarId;

    @FXML
    private TextField estadoId;

    @FXML
    private Button homeid;

    @FXML
    private TextField nHospedantesId;

    @FXML
    private TextField nomeId;

    @FXML
    private TextField paisId;

    @FXML
    private Button passagensId;

    @FXML
    private TextField petId;

    @FXML
    private TextField planejamentoId;

    @FXML
    private TextField quartosId;

    @FXML
    private Button veiculosId;

    @FXML
    private Button viagensId;

    @FXML
    private TextField wifiId;

    @FXML
    void SwitchToViagens(ActionEvent event) {
        try {
            App.setRoot("viagens");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - passageiros.fxml");
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
    void switchToPassageiros(ActionEvent event) {
        try {
            App.setRoot("passageiros");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - passageiros.fxml");
            e.printStackTrace();
        }
    }

    @FXML
    void switchToPassagens(ActionEvent event) {

    }

    @FXML
    void switchToVeiculos(ActionEvent event) {
        try {
            App.setRoot("veiculos");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - passageiros.fxml");
            e.printStackTrace();
        }
    }

    @FXML
    void cancel(ActionEvent event) {

    }

    @FXML
    void enviar(ActionEvent event) {

    }
}
