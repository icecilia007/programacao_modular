package org.example.collections;

import org.example.model.Universidade;

import java.util.ArrayList;
import java.util.List;

public class UniversidadesCollection {
    private List<Universidade> universidades = new ArrayList<>();
    private static UniversidadesCollection instance;

    private UniversidadesCollection() {
    }

    public static UniversidadesCollection getInstance() {
        if (instance == null) {
            instance = new UniversidadesCollection();
        }
        return instance;
    }

    public List<Universidade> getUniversidades() {
        return universidades;
    }

    public void adicionarUniversidade(Universidade universidade) {
        universidades.add(universidade);
    }

    public void editarUniversidade(Universidade universidadeAntiga, Universidade universidadeNova) {
        int index = universidades.indexOf(universidadeAntiga);
        if (index != -1) {
            universidades.set(index, universidadeNova);
        }
    }

    public void excluirUniversidade(Universidade universidade) {
        universidades.remove(universidade);
    }

    public Universidade buscarUniversidade(String nome) {
        for (Universidade universidade : universidades) {
            if (universidade.getNome().equals(nome)) {
                return universidade;
            }
        }
        return null;
    }

    public List<Universidade> listarUniversidades() {
        return universidades;
    }
}
