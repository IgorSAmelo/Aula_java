package Aula_java.Entidade;

import java.util.Date;

public class Cliente {
    // atributos encapsulados
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Date dataNasc;
    private Endereco endereco;

    // constructor vazio
    public Cliente() {
    }

    // método constructor cheio ou full
    public Cliente(String nome, String cpf, String email, String telefone, Date dataNasc, Endereco end) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = end;
    }
    // método get para informar o valor do atributo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Cliente: " +  this.nome + " | " + " CPF: " +  this.cpf;
    }

}