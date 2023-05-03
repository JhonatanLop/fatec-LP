package org.openjfx.atividade;

import java.time.LocalDate;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class PessoaController {
    @FXML
    private Button clean;

    @FXML
    private TextField documentoViajante;

    @FXML
    private TextField email;

    @FXML
    private Button enviarCadastro;

    @FXML
    private Button goBack;

    @FXML
    private DatePicker nascimento;

    @FXML
    private TextField nome;

    @FXML
    void cleanField(ActionEvent event) {
        email.clear();
        nascimento.setPromptText("dd/mm/aaaa");
        nome.clear();
        documentoViajante.clear();
    }

    @FXML
    void goBack(ActionEvent event) {
        App.changeView("menu");
    }

    @FXML
    void sendCad(ActionEvent event) {
        String nomePessoa = nome.getText();
        String emailPessoa = email.getText();
        String documentoPessoa = documentoViajante.getText();
        LocalDate nascimentoPessoa = nascimento.getValue();

        Pessoas pessoa = new Pessoas(nome, nascimentoPessoa, documentoPessoa, email);
    }
}
