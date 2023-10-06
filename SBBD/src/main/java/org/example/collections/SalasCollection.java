package org.example.collections;

import org.example.abstracts.Atividade;
import org.example.model.Sala;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class SalasCollection {
    private static SalasCollection instance;
    private List<Sala> salas;

    public SalasCollection() {
        salas = new ArrayList<>();
    }

    public static SalasCollection getInstance(){
        if(instance == null){
            instance = new SalasCollection();
        }
        return instance;
    }

    public void adicionarSala(Sala sala) {
        salas.add(sala);
    }

    public Sala encontrarSalaPorCodigo(int codigo) {
        for (Sala sala : salas) {
            if (sala.getCodigo() == codigo) {
                return sala;
            }
        }
        return null;
    }

    private List<Sala> encontrarSalasDisponiveis(LocalDate data, LocalTime inicioAtividade, LocalTime fimAtividade) {
        List<Sala> salasDisponiveis = new ArrayList<>();
        for (Sala sala : salas) {
            if (sala.isHorarioDisponivel(data, inicioAtividade, fimAtividade)) {
                salasDisponiveis.add(sala);
            }
        }
        return salasDisponiveis;
    }

    public boolean agendarAtividade(Atividade atividade) {
        List<Sala> salasDisponiveis = encontrarSalasDisponiveis(atividade.getData(), atividade.getHorarioInicio(), atividade.getHorarioFim());
        if (!salasDisponiveis.isEmpty()) {
            Sala salaEscolhida = salasDisponiveis.get(0);
            if (salaEscolhida.agendarAtividade(atividade)) {
                return true;
            } else {
                System.out.println("Não há salas disponíveis para esta atividade.");
                return false;
            }
        } else {
            System.out.println("Não há salas disponíveis para esta atividade.");
            return false;
        }
    }

    public void listarSalas() {
        for (Sala sala : salas) {
            System.out.println(sala);
        }
    }

    public void excluirSala(Sala sala) {
        salas.remove(sala);
    }

    public void editarSala(Sala salaAntiga, Sala salaNova) {
        int index = salas.indexOf(salaAntiga);
        if (index != -1) {
            salas.set(index, salaNova);
        }
    }
}
