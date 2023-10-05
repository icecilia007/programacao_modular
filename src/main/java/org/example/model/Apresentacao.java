package org.example.model;

import java.time.LocalDateTime;

public class Apresentacao {
    private LocalDateTime horaApresentacao;

    public Apresentacao(LocalDateTime horaApresentacao){
        this.horaApresentacao = horaApresentacao;
    }

    public String getHoraApresentacao() {
        return horaApresentacao.toString();
    }

    public void setHoraApresentacao(LocalDateTime horaApresentacao){
        this.horaApresentacao = horaApresentacao;
    }
}
