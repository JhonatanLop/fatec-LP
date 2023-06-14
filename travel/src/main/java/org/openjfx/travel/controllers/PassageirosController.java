package org.openjfx.travel.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import org.openjfx.travel.App;
import org.openjfx.travel.Connection.QueryLibs;
import org.openjfx.travel.classes.Passageiros;
import org.openjfx.travel.utils.Convert;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class PassageirosController {

    @FXML
    private TextField bairroId;

    @FXML
    private Button cancelId;

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
    private Button enviarId;

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
    private TextField tellId;

    @FXML
    private Button veiculosId;

    @FXML
    private Button viagensId;

    // botões

    @FXML
    void saveData(ActionEvent event) throws SQLException {
        Passageiros passageiro = new Passageiros(
            nameId.getText(),
            Convert.convertToInt(documentId),
            Convert.convertToInt(tellId),
            Convert.convertToDate(nascimentoId.getValue()),
            emailId.getText(),
            senhaId.getText(),
            Convert.convertToInt(cepId),
            logradId.getText(),
            numeroId.getText(),
            bairroId.getText(),
            municipioId.getText(),
            estadoId.getText());

        QueryLibs.insertPassageiros(passageiro);
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
    void switchToPassageiro(ActionEvent event) {
        try {
            App.setRoot("passageiros");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - passageiros.fxml");
            e.printStackTrace();
        }
    }

    @FXML
    void switchToPassagens(ActionEvent event) {
        try {
            App.setRoot("passagens");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - passagens.fxml");
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
    void switchToViagens(ActionEvent event) {
        try {
            App.setRoot("viagens");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - viagens.fxml");
            e.printStackTrace();
        }
    }
}
