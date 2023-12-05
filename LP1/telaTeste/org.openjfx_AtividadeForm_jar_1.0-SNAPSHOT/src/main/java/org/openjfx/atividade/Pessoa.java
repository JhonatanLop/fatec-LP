package org.openjfx.atividade;


public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String documento;
    private String email;

    public Pessoa(String nome, String dataNascimento,String documento,String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.documento = documento;
        this.email = email;
    }

    public String getNomePessoa() { return nome; }
    public String getDataNascimentoPessoa() { return dataNascimento; }
    public String getDocumento() { return documento; }
    public String getEmailPessoa() { return email; }

    public void setNomePessoa(String nome) { this.nome = nome; }
    public void setDataNascimentoPessoa(String dataNascimento) { this.dataNascimento = dataNascimento; }
    public void setDocumentoPessoa(String documento) { this.documento = documento; }
    public void setEmailPessoa(String email) { this.email = email; }
}