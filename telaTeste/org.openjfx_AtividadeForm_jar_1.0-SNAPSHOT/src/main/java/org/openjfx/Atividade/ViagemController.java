package org.openjfx.atividade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ViagemController {

    
    @FXML
    private DatePicker dataChegada;
    
    @FXML
    private DatePicker dataPartida;
    
    @FXML
    private TextField documentoViajante;
    
    @FXML
    private TextField localChegada;
    
    @FXML
    private TextField localPartida;
    
    @FXML
    private TextField nomeViajante;
    
    @FXML
    private TextField transporte;
    
    @FXML
    private Button cadViagem;
    
    @FXML
    private Button voltar;
    
    @FXML
    private Button limpar;
    @FXML
    void cadViagem(ActionEvent event) {
        LocalDate dataChegadaT = dataChegada.getValue();
        LocalDate dataPartidaT = dataPartida.getValue();
        String documentoViajanteT = documentoViajante.getText();
        String localChegadaT = localChegada.getText();
        String localPartidaT = localPartida.getText();
        String nomeViajanteT = nomeViajante.getText();
        String transporteT = transporte.getText();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatdataChegada = dataChegadaT.format(formatador);
        String formatdataPartida = dataPartidaT.format(formatador);

        Viagem viagem = new Viagem(documentoViajanteT,localChegadaT,localPartidaT,nomeViajanteT,transporteT, formatdataChegada, formatdataPartida);
        Ticket.setViagem(viagem);
        System.out.println("\n\n\n deu bom caraio");
    }

    @FXML
    void cleanFields(ActionEvent event) {
        localPartida.clear();
        localChegada.clear();
        nomeViajante.clear();
        transporte.clear();
        // dataPartida.setPromptText("dd/mm/yyyy");
        // dataChegada.setPromptText("dd/mm/yyyy");
        documentoViajante.clear();
    }

    @FXML
    void goBack(ActionEvent event) {
        App.changeView("menu");
    }
}
