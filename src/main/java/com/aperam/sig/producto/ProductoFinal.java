package com.aperam.sig.producto;

import com.aperam.sig.ordenDeTrabajo.OrdenDeTrabajo;
import com.aperam.sig.ordenDeTrabajo.Producto;
import net.bytebuddy.utility.RandomString;

import javax.persistence.*;

@Entity
@Table(name = "producto_final")
public class ProductoFinal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "orden_trabajo_id")
    private OrdenDeTrabajo ordenDeTrabajo;
    @Column(name = "evaluacion")
    private String evaluacion;
    @Column(name = "producto")
    private Producto producto;
    @Column(name = "cantidad")
    private Double cantidad;
    @Enumerated
    @Column(name = "estado_productivo")
    private EstadoProductivo estadoProductivo;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "etiqueta_despacho")
    private String etiquetaDespacho;

    public ProductoFinal() { }

    public ProductoFinal(CrearProductoFinal crearProductoFinal, OrdenDeTrabajo ordenDeTrabajo) {
        this.ordenDeTrabajo = ordenDeTrabajo;
        this.producto = crearProductoFinal.getProducto();
        this.cantidad = crearProductoFinal.getCantidad();
        this.estadoProductivo = EstadoProductivo.PENDIENTE_CORROBORACION;
        this.etiquetaDespacho = RandomString.make(6);
    }

    public ProductoFinal(OrdenDeTrabajo ordenDeTrabajo, String evaluacion, Producto producto, Double cantidad, String comentario, String etiquetaDespacho) {
        this.ordenDeTrabajo = ordenDeTrabajo;
        this.evaluacion = evaluacion;
        this.producto = producto;
        this.cantidad = cantidad;
        this.comentario = comentario;
        this.etiquetaDespacho = etiquetaDespacho;
    }

    public Long getId() {
        return id;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public Producto getProducto() {
        return producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public EstadoProductivo getEstadoProductivo() {
        return estadoProductivo;
    }

    public void setEstadoProductivo(EstadoProductivo estadoProductivo) {
        this.estadoProductivo = estadoProductivo;
    }

    public String getComentario() {
        return comentario;
    }

    public OrdenDeTrabajo getOrdenDeTrabajo() {
        return ordenDeTrabajo;
    }

    public String getEtiquetaDespacho() {
        return etiquetaDespacho;
    }
}
