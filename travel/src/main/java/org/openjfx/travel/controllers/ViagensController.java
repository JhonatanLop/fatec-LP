package org.openjfx.travel.controllers;

import java.io.IOException;
import java.sql.SQLException;

import org.openjfx.travel.App;
import org.openjfx.travel.Connection.QueryLibs;
import org.openjfx.travel.classes.Passageiros;
import org.openjfx.travel.classes.Viagem;
import org.openjfx.travel.utils.Convert;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;

public class ViagensController {

    @FXML
    private DatePicker dataPartida;

    @FXML
    private DatePicker dataVolta;

    @FXML
    private ChoiceBox<String> selectDestino;

    @FXML
    private ChoiceBox<String> selectOrigem;

    @FXML
    private ChoiceBox<String> selectPassageiros;

    @FXML
    private ChoiceBox<String> selectTranspIda;

    @FXML
    private ChoiceBox<String> selectTranspVolta;

    @FXML
    void ButtonCancelar(ActionEvent event) {

    }

    @FXML
    void buttonEnviar(ActionEvent event) throws SQLException, ClassNotFoundException {
        Viagem viagem = new Viagem(
            selectPassageiros.toString(),
            selectOrigem.toString(),
            selectDestino.toString(),
            selectTranspIda.toString(),
            selectTranspVolta.toString(),
            Convert.convertToDate(dataPartida.getValue()),
            Convert.convertToDate(dataVolta.getValue()));

            
        QueryLibs.insertViagem(viagem);
        // App.showPopup("model.savePopUp");
    }

    @FXML
    void selectDestino(ActionEvent event) {
    }


    @FXML
    public void initialize() throws SQLException, ClassNotFoundException {
        // carrega todos os dados

        // Passageiros
        // salva resultado da consulta em uma lista
        List<String> listPassageiros = QueryLibs.selectNameAllPassageiros();
        // adiciona os itens da lista na comboBox
        selectPassageiros.getItems().addAll(listPassageiros);

        // Locais
        List<String> listLocais = QueryLibs.selectNameAllLocais();
        selectOrigem.getItems().addAll(listLocais);
        selectDestino.getItems().addAll(listLocais);

        // Transporte
        List<String> listTransp = QueryLibs.selectNameAllTransporte();
        selectTranspIda.getItems().addAll(listTransp);
        selectTranspVolta.getItems().addAll(listTransp);
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
        try {
            App.setRoot("passagens");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - locais.fxml");
            e.printStackTrace();
        }
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