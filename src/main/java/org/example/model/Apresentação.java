package org.example.model;

import java.time.LocalDateTime;

public class Apresentação {
    private LocalDateTime horaApresentação;

    public Apresentação (LocalDateTime horaApresentação){
        this.horaApresentação = horaApresentação;
    }

    public String getHoraApresentação() {
        return horaApresentação.toString();
    }

    public void setHoraApresentação(LocalDateTime horaApresentação){
        this.horaApresentação = horaApresentação;
    }
}
