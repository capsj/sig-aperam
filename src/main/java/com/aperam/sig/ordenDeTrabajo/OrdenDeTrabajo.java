package com.aperam.sig.ordenDeTrabajo;

import com.aperam.sig.bobina.Bobina;

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
    @Enumerated
    @Column(name = "estado")
    private Estado estado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDespacho;
    @Enumerated
    @Column(name = "producto")
    private Producto producto;
    @ManyToOne
    private Bobina bobina;

    public OrdenDeTrabajo() {}

    public OrdenDeTrabajo(CrearOrdenDeTrabajo crearOrdenDeTrabajo, Bobina bobina) {
        this.serieSolicitada = crearOrdenDeTrabajo.getSerieSolicitada();
        this.espesorSolicitado = crearOrdenDeTrabajo.getEspesorSolicitado();
        this.anchoSolicitado = crearOrdenDeTrabajo.getAnchoSolicitado();
        this.largoSolicitado = crearOrdenDeTrabajo.getLargoSolicitado();
        this.esmerilado = crearOrdenDeTrabajo.getEsmerilado();
        this.cantidad = crearOrdenDeTrabajo.getCantidad();
        this.estado = crearOrdenDeTrabajo.getEstado();
        this.producto = crearOrdenDeTrabajo.getProducto();
        this.fecha = new Date();
        this.fechaDespacho = crearOrdenDeTrabajo.getFechaDespacho();
        this.bobina = bobina;
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

    public Estado getEstado() {
        return estado;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public Producto getProducto() {
        return producto;
    }

    public Bobina getBobina() {
        return bobina;
    }
}
