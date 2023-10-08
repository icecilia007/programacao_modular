package org.example.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Apresentacao {
    private int codigo;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;
    private LocalDate data;
    private Trabalho trabalho;
    public Apresentacao() {
    }

    public Apresentacao(LocalTime horarioInicio, LocalTime horarioFim, LocalDate data) {
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.data = data;
        this.trabalho = null;
    }

    public Apresentacao(int codigo, LocalTime horarioInicio, LocalTime horarioFim, LocalDate data) {
        this.codigo = codigo;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.data = data;
        this.trabalho = null;
    }

    public Apresentacao(int codigo, LocalTime horarioInicio, LocalTime horarioFim, LocalDate data, Trabalho trabalho) {
        this.codigo = codigo;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.data = data;
        this.trabalho = trabalho;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    @Override
    public String toString() {
        return "Apresentacao{" +
                "codigo=" + codigo +
                ", horarioInicio=" + horarioInicio +
                ", horarioFim=" + horarioFim +
                ", data=" + data +
                ", trabalho=" + trabalho +
                '}';
    }
}
