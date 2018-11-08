package com.aperam.sig.bobina;

import javax.persistence.*;

@Entity
@Table(name = "bobina")
public class Bobina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "serie")
    private String serie;
    @Column(name = "ancho")
    private Double ancho;
    @Column(name = "espesor")
    private Double espesor;
    @Column(name = "peso_total")
    private Double pesoTotal;
    @Column(name = "largo")
    private Double largo;
    @Column(name = "aptitud_inicial")
    private Double aptitudInicial;
    @Column(name = "aptitud_final")
    private Double aptitudFinal;

    public Bobina() {

    }

    public Bobina(String codigo, String serie, Double ancho, Double espesor, Double pesoTotal, Double largo, Double aptitudInicial, Double aptitudFinal) {
        this.codigo = codigo;
        this.serie = serie;
        this.ancho = ancho;
        this.espesor = espesor;
        this.pesoTotal = pesoTotal;
        this.largo = largo;
        this.aptitudInicial = aptitudInicial;
        this.aptitudFinal = aptitudFinal;
    }

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
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

    public Double getPesoTotal() {
        return pesoTotal;
    }

    public Double getLargo() {
        return largo;
    }

    public Double getAptitudFinal() {
        return aptitudFinal;
    }

    public Double getAptitudInicial() {
        return aptitudInicial;
    }
}
