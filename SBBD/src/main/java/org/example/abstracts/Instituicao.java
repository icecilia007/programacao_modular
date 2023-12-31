package org.example.abstracts;

public abstract class Instituicao {
    private long cnpj;
    private String endereco;
    private String nome;
    private String nomeResponsavel;

    public Instituicao(long cnpj, String endereco, String nome, String nomeResponsavel) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
        this.nomeResponsavel = nomeResponsavel;
    }

    // Getters e Setters para os atributos

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

}

