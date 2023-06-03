package org.openjfx.travel.controllers;

import java.io.IOException;

import org.openjfx.travel.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class PassageirosController {
    @FXML
    private Button PassageirosId;

    @FXML
    private TextField bairroId;

    @FXML
    private Button canceId;

    @FXML
    private TextField cepId;

    @FXML
    private TextField confirmEmailId;

    @FXML
    private TextField confirmSenhaid;

    @FXML
    private TextField documentId;

    @FXML
    private TextField emailId;

    @FXML
    private TextField estadoId;

    @FXML
    private Button homeid;

    @FXML
    private Button locaisId;

    @FXML
    private TextField logradId;

    @FXML
    private TextField municipioId;

    @FXML
    private TextField nameId;

    @FXML
    private DatePicker nascimentoId;

    @FXML
    private TextField numeroId;

    @FXML
    private Button passagensId;

    @FXML
    private TextField senhaId;

    @FXML
    private TextField telId1;

    @FXML
    private Button veiculosId;

    @FXML
    private Button viagensId;

    // botões

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
    void switchToPassageiro(ActionEvent event) {
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
    void switchToVeiculos(ActionEvent event) {
        try {
            App.setRoot("veiculos");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - locais.fxml");
            e.printStackTrace();
        }
    }

    @FXML
    void switchToViagens(ActionEvent event) {

    }
}
