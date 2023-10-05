package org.example.model;

import org.example.abstracts.Pessoa;

public class Profissional extends Pessoa {
    private String areaEspecifica;

    public Profissional(String nome, String sobrenome, String email, String telefone, String areaEspecifica) {
        super(nome, sobrenome, email, telefone);
        this.areaEspecifica = areaEspecifica;
    }

    public String getAreaEspecifica() {
        return areaEspecifica;
    }

    public void setAreaEspecifica(String areaEspecifica) {
        this.areaEspecifica = areaEspecifica;
    }

    @Override
    public void apresentar() {
        System.out.println("Profissional: " + getNome() + " " + getSobrenome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Área Específica: " + getAreaEspecifica());
    }

    @Override
    public String toString() {
        return "Profissional{" +
                "areaEspecifica='" + areaEspecifica + '\'' +
                '}';
    }
}

