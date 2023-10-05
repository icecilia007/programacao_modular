package org.example.model;

import org.example.abstracts.Pessoa;

public class Professor extends Pessoa {
    private int matricula;
    private String departamento;

    public Professor(String nome, String sobrenome, String email, String telefone, String departamento, int matricula) {
        super(nome, sobrenome, email, telefone);
        this.matricula=matricula;
        this.departamento=departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void apresentar() {
        System.out.println("Nome: " + getNome() + " " + getSobrenome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Departamento: " + getDepartamento());
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + matricula +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
