package org.example.model;

import java.sql.Time;
import java.time.LocalDateTime;

public class Apresentacao {
    private Time horaApresentacao;

    public Apresentacao(Time horaApresentacao){
        this.horaApresentacao = horaApresentacao;
    }

    public String getHoraApresentacao() {
        return horaApresentacao.toString();
    }

    public void setHoraApresentacao(Time horaApresentacao){
        this.horaApresentacao = horaApresentacao;
    }
}
