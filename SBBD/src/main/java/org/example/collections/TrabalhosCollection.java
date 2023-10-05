package org.example.collections;

import org.example.model.Trabalho;
import java.util.ArrayList;
import java.util.List;

public class TrabalhosCollection {
    private static TrabalhosCollection instance;
    private List<Trabalho> trabalhos;

    private TrabalhosCollection() {
        trabalhos = new ArrayList<>();
    }

    public static TrabalhosCollection getInstance() {
        if (instance == null) {
            instance = new TrabalhosCollection();
        }
        return instance;
    }

    public void adicionarTrabalho(Trabalho trabalho) {
        trabalhos.add(trabalho);
    }

    public void removerTrabalho(Trabalho trabalho) {
        trabalhos.remove(trabalho);
    }

    public List<Trabalho> listarTrabalhos() {
        return trabalhos;
    }

    public Trabalho encontrarTrabalhoPorId(int id) {
        for (Trabalho trabalho : trabalhos) {
            if (trabalho.getId() == id) {
                return trabalho;
            }
        }
        return null;
    }
}

