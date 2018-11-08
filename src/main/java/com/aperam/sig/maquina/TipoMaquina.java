package com.aperam.sig.maquina;

public enum TipoMaquina {
    FLEJADORA_GRANDE(10.4),
    FLEJADORA_CHICA(2.0),
    MESEZA(5.9);

    private Double velocidadMaxima;

    TipoMaquina(Double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
