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

    // local
    @FXML
    private Text paisT;

    @FXML
    private Text estadoT;

    @FXML
    private Text cidadeT;

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
        // nomePessoaT.setText("Pessoa: " + Ticket.pessoaNome.getText());

        // System.out.println(pessoa.getPessoas(0).getNomePessoa().toString());
        // System.out.println("oi");

        // pessoa
        if (Ticket.getPessoa() != null) {
            nomePessoaT.setText("Nome: " + Ticket.getPessoa().getNomePessoa());
            emailPessoaT.setText("Email: " + Ticket.getPessoa().getEmailPessoa());
            documentoPessoaT.setText("Documento: " + Ticket.getPessoa().getDocumento());
            idadePessoaT.setText("Idade: " + Ticket.getPessoa().getDataNascimentoPessoa());
        }

        // viagem
        if (Ticket.getViagem() != null) {
            nomeViajanteT.setText("Viajante: " + Ticket.getViagem().getNomeViajante());
            localPartidaT.setText("Local de Partida:\n" + Ticket.getViagem().getLocalPartida());
            localChegadaT.setText("Local de Chegada:\n" + Ticket.getViagem().getLocalChegada());
            dataPartidaT.setText("Data de Partida: " + Ticket.getViagem().getDataPartida());
            dataChegadaT.setText("Data de Chegada: " + Ticket.getViagem().getDataChegada());
        }

        // lugar
        if (Ticket.getLugar() != null) {
            paisT.setText("Pais: " + Ticket.getLugar().getPais());
            estadoT.setText("Estado: " + Ticket.getLugar().getEstado());
            cidadeT.setText("Cidade: " + Ticket.getLugar().getCidade());
        }

        // transporte
        if (Ticket.getVeiculo() != null) {
            marcaT.setText("Marca: " + Ticket.getVeiculo().getMarca());
            anoT.setText("Ano: " + Ticket.getVeiculo().getAno());
            modeloT.setText("Modelo: " + Ticket.getVeiculo().getModelo());
            tipoT.setText("Tipo: " + Ticket.getVeiculo().getTipo());
        }
    }
}
