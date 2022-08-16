package com.project.target.estagio.answer3;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

public  class Dia {
    private Integer dia;
    private Double valor;

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


}