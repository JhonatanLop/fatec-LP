package org.openjfx.travel.controllers;

import java.io.IOException;

import org.openjfx.travel.App;
import org.openjfx.travel.Connection.QueryLibs;
import org.openjfx.travel.classes.Passageiros;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ViagensController {
    
    @FXML
    private Button PassageirosId;

    @FXML
    private DatePicker dataPartida;

    @FXML
    private DatePicker dataVolta;

    @FXML
    private TextField destinoViagem;

    @FXML
    private Button homeid;

    @FXML
    private ListView<?> listPassageiros;

    @FXML
    private Button locaisId;

    @FXML
    private TextField origemViagem;

    @FXML
    private TextField passageiros;

    @FXML
    private Button passagensId;

    @FXML
    private TextField transpIda;

    @FXML
    private TextField transpVolta;

    @FXML
    private Button veiculosId;

    @FXML
    private ChoiceBox<Passageiros> selectPassageiro;

    @FXML
    void ButtonCancelar(ActionEvent event) {

    }

    @FXML
    void buttonEnviar(ActionEvent event) {

    }

    @FXML
    void selectDestino(ActionEvent event) {

    }

    @FXML
    void selectOrigem(ActionEvent event) {

    }

    @FXML
    void selectPassageiro(ActionEvent event) {

    }

    @FXML
    void selectTranspIda(ActionEvent event) {

    }

    @FXML
    void selectTranspVolta(ActionEvent event) {

    }

    @FXML
    public void initialize(){
        ChoiceBox.getItems().addAll(QueryLibs.selectAllPassageiros());
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