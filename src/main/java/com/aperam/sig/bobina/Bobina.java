package com.aperam.sig.bobina;

import com.aperam.sig.ordenDeCompra.OrdenDeCompra;
import net.bytebuddy.utility.RandomString;

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
    private boolean aptitudInicial;
    @Column(name = "aptitud_final")
    private boolean aptitudFinal;
    @Enumerated
    @Column(name = "estado_productivo")
    private EstadoProductivo estadoProductivo;
    @Column(name = "orden_compra")
    private Long ordenDeCompraId;
    @Column(name = "comentario")
    private String comentario;

    public Bobina() { }

    public Bobina(OrdenDeCompra ordenDeCompra) {
        this.codigo = RandomString.make(6);
        this.serie = ordenDeCompra.getSerie();
        this.ancho = ordenDeCompra.getAncho();
        this.espesor = ordenDeCompra.getEspesor();
        this.pesoTotal = ordenDeCompra.getPeso();
        this.largo = 0.0;
        this.aptitudInicial = false;
        this.aptitudFinal = false;
        this.estadoProductivo = EstadoProductivo.PENDIENTE_CONTROL;
        this.ordenDeCompraId = ordenDeCompra.getId();
    }

    public Bobina(String codigo, String serie, Double ancho, Double espesor, Double pesoTotal, Double largo, String comentario) {
        this.codigo = codigo;
        this.serie = serie;
        this.ancho = ancho;
        this.espesor = espesor;
        this.pesoTotal = pesoTotal;
        this.largo = largo;
        this.comentario = comentario;
        this.aptitudInicial = false;
        this.aptitudFinal = false;
        this.estadoProductivo = EstadoProductivo.PENDIENTE_CONTROL;
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

    public boolean getAptitudFinal() {
        return aptitudFinal;
    }

    public boolean getAptitudInicial() {
        return aptitudInicial;
    }

    public EstadoProductivo getEstadoProductivo() {
        return estadoProductivo;
    }

    public void setEstadoProductivo(EstadoProductivo estadoProductivo) {
        this.estadoProductivo = estadoProductivo;
    }

    public Long getOrdenDeCompraId() {
        return ordenDeCompraId;
    }

    public String getComentario() {
        return comentario;
    }
}
