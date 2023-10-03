package org.example.model;

import org.example.abstracts.Pessoa;

public class Estudante extends Pessoa {
    private int matricula;
    private String curso;

    public Estudante(String nome, String sobrenome, String email, String telefone, int matricula, String curso) {
        super(nome, sobrenome, email, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Estudante: " + getNome() + " " + getSobrenome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}

