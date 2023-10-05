package org.example.collections;

import org.example.model.Estudante;

import java.util.ArrayList;
import java.util.List;

public class EstudanteCollection {
    private List<Estudante> estudantes = new ArrayList<>();
    private static EstudanteCollection instance;

    private EstudanteCollection() {
    }

    public static EstudanteCollection getInstance() {
        if (instance == null) {
            instance = new EstudanteCollection();
        }
        return instance;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void editarEstudante(Estudante estudanteAntigo, Estudante estudanteNovo) {
        int index = estudantes.indexOf(estudanteAntigo);
        if (index != -1) {
            estudantes.set(index, estudanteNovo);
        }
    }

    public void excluirEstudante(Estudante estudante) {
        estudantes.remove(estudante);
    }

    public Estudante buscarEstudante(String nome) {
        for (Estudante estudante : estudantes) {
            if (estudante.getNome().equals(nome)) {
                return estudante;
            }
        }
        return null;
    }

    public List<Estudante> listarEstudantes() {
        return estudantes;
    }
}
