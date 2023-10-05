package org.example.abstracts;

import org.example.model.Sala;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Atividade {
    private int codigo;
    private LocalDate data;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;
    private Sala salaAssociada;
    private List<Pessoa> participantes;

    public Atividade(int codigo, LocalDate data, LocalTime horarioInicio, LocalTime horarioFim) {
        this.codigo = codigo;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.salaAssociada = null;
        this.participantes = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalTime getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(LocalTime horarioFim) {
        this.horarioFim = horarioFim;
    }

    public Sala getSalaAssociada() {
        return salaAssociada;
    }

    public void setSalaAssociada(Sala salaAssociada) {
        this.salaAssociada = salaAssociada;
    }

    public List<Pessoa> getParticipantes() {
        return participantes;
    }

    public void adicionarParticipante(Pessoa pessoa) {
        participantes.add(pessoa);
    }

    public void removerParticipante(Pessoa pessoa) {
        participantes.remove(pessoa);
    }

    public abstract String getTipoAtividade();

    @Override
    public String toString() {
        return "Atividade{" +
                "codigo=" + codigo +
                ", data=" + data +
                ", horarioInicio=" + horarioInicio +
                ", horarioFim=" + horarioFim +
                ", salaAssociada=" + salaAssociada +
                ", participantes=" + participantes +
                '}';
    }
}

