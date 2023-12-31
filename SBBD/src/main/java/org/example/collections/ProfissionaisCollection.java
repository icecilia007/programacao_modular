package org.example.collections;

import org.example.model.Profissional;

import java.util.ArrayList;
import java.util.List;

public class ProfissionaisCollection {
    private List<Profissional> profissionais = new ArrayList<>();
    private static ProfissionaisCollection instance;

    private ProfissionaisCollection() {
    }

    public static ProfissionaisCollection getInstance() {
        if (instance == null) {
            instance = new ProfissionaisCollection();
        }
        return instance;
    }

    public List<Profissional> getProfissionais() {
        return profissionais;
    }

    public void adicionarProfissional(Profissional profissional) {
        profissionais.add(profissional);
    }

    public void editarProfissional(Profissional profissionalAntigo, Profissional profissionalNovo) {
        int index = profissionais.indexOf(profissionalAntigo);
        if (index != -1) {
            profissionais.set(index, profissionalNovo);
        }
    }

    public void excluirProfissional(Profissional profissional) {
        profissionais.remove(profissional);
    }

    public Profissional buscarProfissional(String nome) {
        for (Profissional profissional : profissionais) {
            if (profissional.getNome().equals(nome)) {
                return profissional;
            }
        }
        return null;
    }

    public List<Profissional> listarProfissionais() {
        return profissionais;
    }
}
