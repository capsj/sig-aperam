package com.aperam.sig.ordenDeCompra;

import javax.persistence.*;

@Entity
@Table(name = "orden_compra")
public class OrdenDeCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "serie")
    private String serie;
    @Column(name = "ancho")
    private Double ancho;
    @Column(name = "espesor")
    private Double espesor;
    @Column(name = "peso")
    private Double peso;

    public OrdenDeCompra() {}

    public OrdenDeCompra(Long id, String serie, Double ancho, Double espesor, Double peso) {
        this.id = id;
        this.serie = serie;
        this.ancho = ancho;
        this.espesor = espesor;
        this.peso = peso;
    }

    public Long getId() {
        return id;
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
        return peso;
    }

}
