package org.example.collections;

import org.example.model.Apresentacao;

import java.util.ArrayList;
import java.util.List;

public class ApresentacaoCollection {
    public static ApresentacaoCollection instance;

    private List<Apresentacao> apresentacao;

    private ApresentacaoCollection(){
        apresentacao = new ArrayList<>();
    }

    public static ApresentacaoCollection getInstance() {
        if (instance == null) {
            instance = new ApresentacaoCollection();
        }
        return instance;
    }
}
