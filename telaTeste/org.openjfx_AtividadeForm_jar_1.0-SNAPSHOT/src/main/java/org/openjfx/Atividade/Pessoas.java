package org.openjfx.atividade;

import java.time.LocalDate;
import java.util.Date;

import javafx.scene.control.TextField;

public class Pessoas {
    TextField nome;
    LocalDate dataNascimento;
    String documento;
    TextField email;

    public Pessoas(TextField nome2, LocalDate nascimentoPessoa,String documento,TextField email2) {
        this.nome = nome2;
        this.dataNascimento = nascimentoPessoa;
        this.documento = documento;
        this.email = email2;
    }

    public void getNomePessoa(TextField nome) { this.nome = nome; }
    public void getDataNascimentoPessoa(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    public void getDocumento(String documento) { this.documento = documento; }
    public void getEmailPessoa(TextField email) { this.email = email; }
}
