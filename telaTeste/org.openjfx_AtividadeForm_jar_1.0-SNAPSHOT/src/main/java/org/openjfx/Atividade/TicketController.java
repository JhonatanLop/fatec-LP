package org.openjfx.atividade;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class TicketController {
    
    // pessoa
    @FXML
    private Text nomePessoaT;

    @FXML
    private Text emailPessoaT;

    @FXML
    private Text documentoPessoaT;

    @FXML
    private Text idadePessoaT;

    // viagem
    @FXML
    private Text nomeViajanteT;

    @FXML
    private Text localPartidaT;
    
    @FXML
    private Text localChegadaT;
    
    @FXML
    private Text dataPartidaT;

    @FXML
    private Text dataChegadaT;
    
    // transporte
    @FXML
    private Text marcaT;

    @FXML
    private Text anoT;

    @FXML
    private Text modeloT;

    @FXML
    private Text tipoT;

    public void initialize() {
    //     nomePessoaT.setText("Pessoa: " + Ticket.pessoaNome.getText());
    
    // System.out.println(pessoa.getPessoas(0).getNomePessoa().toString());
    System.out.println("oi");
    nomePessoaT.setText("Nome: " + Ticket.getPessoa().getNomePessoa());
    }
}
