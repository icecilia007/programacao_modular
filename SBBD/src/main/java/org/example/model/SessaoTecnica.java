package org.example.model;

import org.example.abstracts.Atividade;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SessaoTecnica extends Atividade {
    private Professor mediador;
    private List<Apresentacao> apresentacaoList;

    public SessaoTecnica(int codigo, LocalDate data, LocalTime horarioInicio, LocalTime horarioFim, Professor mediador) {
        super(codigo, data, horarioInicio, horarioFim);
        this.mediador = mediador;
        this.apresentacaoList = new ArrayList<>();
    }

    public Professor getMediador() {
        return mediador;
    }

    public void setMediador(Professor mediador) {
        this.mediador = mediador;
    }
    public boolean agendarApresentacao(Apresentacao apresentacao){
        if(isHorarioDisponivel(apresentacao.getHorarioInicio(),apresentacao.getHorarioFim(), apresentacao.getData())){
            apresentacao.setSessaoTecnica(this);
            apresentacaoList.add(apresentacao);
        }
        return false;
    }

    private boolean isHorarioDisponivel(LocalTime horarioInicio, LocalTime horarioFim, LocalDate data) {
        for(Apresentacao apresentacao: apresentacaoList){
            if(apresentacao.getData().isEqual(data) && (
                    horarioInicio.isAfter(apresentacao.getHorarioInicio()) && horarioInicio.isBefore(apresentacao.getHorarioFim()) ||
                            (horarioFim.isAfter(apresentacao.getHorarioFim()) && horarioFim.isBefore(apresentacao.getHorarioFim())))){
                return false;
            }
        }
        return true;
    }

    @Override
    public String getTipoAtividade() {
        return "Sessão Técnica";
    }
}

