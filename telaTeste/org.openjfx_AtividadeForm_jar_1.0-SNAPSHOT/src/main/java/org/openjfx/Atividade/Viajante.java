package org.openjfx.Atividade;

import java.sql.Date;

public class Viajante {
    String nome;
    String email;
    Date nascimento;
    String cpf;

    public Viajante(
        String nome,
        String email,
        Date nascimento,
        String cpf
    ){
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }
}
