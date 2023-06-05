package org.openjfx.travel.controllers;

import java.io.IOException;

import org.openjfx.travel.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class VeiculoController {
   
    @FXML
    private Button PassageirosId;

    @FXML
    private DatePicker anoFabId;

    @FXML
    private Button canceId;

    @FXML
    private TextField carroceriaId;

    @FXML
    private TextField chassiId;

    @FXML
    private TextField consumoMedId;

    @FXML
    private Button enviarId;

    @FXML
    private TextField espCargId;

    @FXML
    private Button homeid;

    @FXML
    private Button locaisId;

    @FXML
    private TextField marcaId;

    @FXML
    private TextField modeloId;

    @FXML
    private TextField motorId;

    @FXML
    private Button passagensId;

    @FXML
    private TextField qtdPassagId;

    @FXML
    private TextField tipoId;

    @FXML
    private TextField transmId;

    @FXML
    private TextField veicId;

    @FXML
    private Button viagensId;

    @FXML
    void SwitchToViagens(ActionEvent event) {

    }

    @FXML
    void cancel(ActionEvent event) {

    }

    @FXML
    void enviar(ActionEvent event) {

    }

    @FXML
    void switchToHome(ActionEvent event) {
        try {
            App.setRoot("primary");
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
            System.out.println("Erro! - Falha ao mudar para tela - locais.fxml");
            e.printStackTrace();
        }
    }

    @FXML
    void switchToPassagens(ActionEvent event) {

    }

    @FXML
    void switckToLocais(ActionEvent event) {
        try {
            App.setRoot("locais");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - locais.fxml");
            e.printStackTrace();
        }
    }
}
