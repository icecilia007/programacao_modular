package org.example.model;

import org.example.abstracts.Instituicao;

public class Empresa extends Instituicao {
    private String ramoAtividade;

    public Empresa(long cnpj, String endereco, String nome, String nomeResponsavel, String ramoAtividade) {
        super(cnpj, endereco, nome, nomeResponsavel);
        this.ramoAtividade = ramoAtividade;
    }
    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "ramoAtividade='" + ramoAtividade + '\'' +
                '}';
    }
}

