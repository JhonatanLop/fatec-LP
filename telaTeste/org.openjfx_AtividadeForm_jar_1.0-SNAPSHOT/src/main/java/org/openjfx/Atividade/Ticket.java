package org.openjfx.atividade;

public class Ticket {
    static Pessoa pessoa;
    static Viagem viagem;
    static Veiculo veiculo;
    static Viajante viajante;


    public static Pessoa getPessoa() { return pessoa;}
    public static void setPessoa(Pessoa pessoa) { Ticket.pessoa = pessoa;}
    public static Viagem getViagem() { return viagem;}
    public static void setViagem(Viagem viagem) { Ticket.viagem = viagem;}
    public static Veiculo getVeiculo() { return veiculo;}
    public static void setVeiculo(Veiculo veiculo) { Ticket.veiculo = veiculo;}
    public static Viajante getViajante() { return viajante;}
    public static void setViajante(Viajante viajante) { Ticket.viajante = viajante;}
}
