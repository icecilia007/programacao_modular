package org.example.model;

import org.example.model.Estudante;
import org.example.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class Trabalho {
    private int id;
    private String titulo;
    private String resumo;
    private List<Estudante> autores;
    private Professor orientador;
    private Apresentacao apresentacao;

    public Trabalho() {
    }

    public Trabalho(int id, String titulo, String resumo, Professor orientador) {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.orientador = orientador;
        this.autores = new ArrayList<>();
        this.apresentacao = null;
    }

    public Trabalho(int id, String titulo, String resumo, List<Estudante> autores, Professor orientador, Apresentacao apresentacao) {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.autores = autores;
        this.orientador = orientador;
        this.apresentacao = apresentacao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public List<Estudante> getAutores() {
        return autores;
    }

    public void adicionarAutor(Estudante autor) {
        autores.add(autor);
    }

    public void removerAutor(Estudante autor) {
        autores.remove(autor);
    }

    public Apresentacao getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(Apresentacao apresentacao) {
        this.apresentacao = apresentacao;
    }

    @Override
    public String toString() {
        return "Trabalho{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", resumo='" + resumo + '\'' +
                ", autores=" + autores +
                ", orientador=" + orientador +
                ", apresentacao=" + apresentacao +
                '}';
    }
}

