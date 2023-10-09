package org.example.collections;

import org.example.model.Apresentacao;
import org.example.model.Professor;
import org.example.model.Trabalho;

import java.util.ArrayList;
import java.util.List;

public class ApresentacaoCollection {
    private static ApresentacaoCollection instance;
    private List<Apresentacao> apresentacoes;

    public ApresentacaoCollection() {
        apresentacoes = new ArrayList<>();
    }
    public static ApresentacaoCollection getInstance(){
        if(instance == null){
            instance = new ApresentacaoCollection();
        }
        return instance;
    }
    public List<Apresentacao> listarApresentacoes(){
        return apresentacoes;
    }
    public void excluirApresentacao(Apresentacao apresentacao){
        apresentacoes.remove(apresentacao);
    }
    public Apresentacao encontrarApresentacao(int codigo){
        for(Apresentacao apresentacao : apresentacoes){
            if(apresentacao.getCodigo() == codigo){
                return  apresentacao;
            }
        }
        return null;
    }
    public void editarApresentacao(Apresentacao apresentacaoAntiga, Apresentacao apresentacaoNova ){
        int index = apresentacoes.indexOf(apresentacaoAntiga);
        if(index!=-1){
            apresentacoes.set(index,apresentacaoNova);
        }
    }
    public void adicionarApresentacao(Apresentacao apresentacao, Trabalho trabalho){
        //assim que adicionar apresentaçao setar o trabalho e apresentaçao
        if(apresentacao.getSessaoTecnica()!=null) {
            apresentacao.setTrabalho(trabalho);
            trabalho.setApresentacao(apresentacao);
            apresentacoes.add(apresentacao);
            System.out.println("Apresentacao adicionado");
        }else{
            System.out.println("Apresentacao não tem sessao tecnica");
        }
    }
}
