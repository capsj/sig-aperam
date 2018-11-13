package com.aperam.sig.ordenDeTrabajo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orden_de_trabajo")
public class OrdenDeTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "serieSolicitada")
    private String serieSolicitada;
    @Column(name = "espesorSolicitado")
    private Double espesorSolicitado;
    @Column(name = "anchoSolicitado")
    private Double anchoSolicitado;
    @Column(name = "largoSolicitado")
    private Double largoSolicitado;
    @Column(name = "esmerilado")
    private String esmerilado;
    @Column(name = "cantidad")
    private Double cantidad;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "estado")
    private String estado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDespacho;

    public OrdenDeTrabajo() {}

    public OrdenDeTrabajo(Long id, String serieSolicitada, Double espesorSolicitado, Double anchoSolicitado, Double largoSolicitado,
                          String esmerilado, Double cantidad, String estado, Date fechaDespacho) {
        this.id = id;
        this.serieSolicitada = serieSolicitada;
        this.espesorSolicitado = espesorSolicitado;
        this.anchoSolicitado = anchoSolicitado;
        this.largoSolicitado = largoSolicitado;
        this.esmerilado = esmerilado;
        this.cantidad = cantidad;
        this.estado = estado;
        this.fecha = new Date();
        this.fechaDespacho = fechaDespacho;
    }


    public Long getId() {
        return id;
    }

    public String getSerieSolicitada() {
        return serieSolicitada;
    }

    public Double getEspesorSolicitado() {
        return espesorSolicitado;
    }

    public Double getAnchoSolicitado() {
        return anchoSolicitado;
    }

    public Double getLargoSolicitado() {
        return largoSolicitado;
    }

    public String getEsmerilado() {
        return esmerilado;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }
}
