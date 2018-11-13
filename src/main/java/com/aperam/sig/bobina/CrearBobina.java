package com.aperam.sig.bobina;

import com.aperam.sig.ordenDeCompra.OrdenDeCompra;
import net.bytebuddy.utility.RandomString;

import javax.persistence.*;

public class CrearBobina {

    private String serie;
    private Double ancho;
    private Double espesor;
    private Double pesoTotal;
    private Double largo;
    private Long ordenDeCompraId;

    public CrearBobina() { }

    public CrearBobina(OrdenDeCompra ordenDeCompra) {
        this.serie = ordenDeCompra.getSerie();
        this.ancho = ordenDeCompra.getAncho();
        this.espesor = ordenDeCompra.getEspesor();
        this.pesoTotal = ordenDeCompra.getPeso();
        this.largo = 0.0;
        this.ordenDeCompraId = ordenDeCompra.getId();
    }

    public CrearBobina(String codigo, String serie, Double ancho, Double espesor, Double pesoTotal, Double largo, String comentario) {
        this.serie = serie;
        this.ancho = ancho;
        this.espesor = espesor;
        this.pesoTotal = pesoTotal;
        this.largo = largo;
    }

    public String getSerie() {
        return serie;
    }

    public Double getAncho() {
        return ancho;
    }

    public Double getEspesor() {
        return espesor;
    }

    public Double getPeso() {
        return pesoTotal;
    }

    public Double getLargo() {
        return largo;
    }

    public Long getOrdenDeCompraId() {
        return ordenDeCompraId;
    }
}