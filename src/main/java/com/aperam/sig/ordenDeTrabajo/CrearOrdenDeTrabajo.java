package com.aperam.sig.ordenDeTrabajo;

import java.util.Date;

public class CrearOrdenDeTrabajo {

    private String serieSolicitada;
    private Double espesorSolicitado;
    private Double anchoSolicitado;
    private Double largoSolicitado;
    private String esmerilado;
    private Double cantidad;
    private Date fecha;
    private Estado estado;
    private Date fechaDespacho;
    private Producto producto;

    public CrearOrdenDeTrabajo() {}

    public CrearOrdenDeTrabajo(String serieSolicitada, Double espesorSolicitado, Double anchoSolicitado, Double largoSolicitado,
                               String esmerilado, Double cantidad, Date fechaDespacho, Producto producto) {
        this.serieSolicitada = serieSolicitada;
        this.espesorSolicitado = espesorSolicitado;
        this.anchoSolicitado = anchoSolicitado;
        this.largoSolicitado = largoSolicitado;
        this.esmerilado = esmerilado;
        this.cantidad = cantidad;
        this.estado = Estado.PENDIENTE;
        this.producto = producto;
        this.fecha = new Date();
        this.fechaDespacho = fechaDespacho;
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

    public Estado getEstado() {
        return estado;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public Producto getProducto() {
        return producto;
    }
}
