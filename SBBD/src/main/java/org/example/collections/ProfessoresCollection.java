package org.example.collections;

import org.example.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessoresCollection {
    private static ProfessoresCollection instance;
    private List<Professor> professores;

    private ProfessoresCollection() {
        professores = new ArrayList<>();
    }

    public static ProfessoresCollection getInstance() {
        if (instance == null) {
            instance = new ProfessoresCollection();
        }
        return instance;
    }

    public void adicionarProfessor(Professor professor) {
        if(professores.add(professor)){
            System.out.println("Professor adicionado ->\n"+ professor.toString());
            professor.apresentar();
        }
    }

    public void editarProfessor(Professor professorAntigo, Professor professorNovo) {
        int index = professores.indexOf(professorAntigo);
        if (index != -1) {
            professores.set(index, professorNovo);
        }
    }

    public void excluirProfessor(Professor professor) {
        professores.remove(professor);
    }

    public Professor buscarProfessor(String nome) {
        for (Professor professor : professores) {
            if (professor.getNome().equals(nome)) {
                return professor;
            }
        }
        return null;
    }

    public List<Professor> listarProfessores() {
        return professores;
    }
}

