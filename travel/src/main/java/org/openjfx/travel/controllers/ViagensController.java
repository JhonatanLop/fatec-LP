package org.openjfx.travel.controllers;

import java.io.IOException;

import org.openjfx.travel.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ViagensController {
    @FXML
    private Button PassageirosId;

    @FXML
    private Button buttonLugar;

    @FXML
    private DatePicker dataPartida;

    @FXML
    private DatePicker dataVolta;

    @FXML
    private Button homeid;

    @FXML
    private ListView<?> listPassageiros;

    @FXML
    private Button locaisId;

    @FXML
    private TextField lugar;

    @FXML
    private TextField passageiros;

    @FXML
    private Button passagensId;

    @FXML
    private TextField tfTransporte;

    @FXML
    private Button veiculosId;

    @FXML
    void ButtonCancelar(ActionEvent event) {

    }

    @FXML
    void buttonEnviar(ActionEvent event) {

    }

    @FXML
    void selectLugar(ActionEvent event) {

    }

    @FXML
    void selectPassageiro(ActionEvent event) {

    }

    @FXML
    void selectTransporte(ActionEvent event) {

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
        // try {
        //     App.setRoot("passagens");
        // } catch (IOException e) {
        //     System.out.println("Erro! - Falha ao mudar para tela - locais.fxml");
        //     e.printStackTrace();
        // }
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
    void switckToLocais(ActionEvent event) {
        try {
            App.setRoot("locais");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - locais.fxml");
            e.printStackTrace();
        }
    }
}