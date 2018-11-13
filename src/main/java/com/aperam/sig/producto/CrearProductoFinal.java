package com.aperam.sig.producto;

import com.aperam.sig.ordenDeTrabajo.Producto;

public class CrearProductoFinal {

    private Long ordenDeTrabajoId;
    private Producto producto;
    private Double cantidad;

    public CrearProductoFinal() { }

    public CrearProductoFinal(Long ordenDeTrabajoId, Producto producto, Double cantidad) {
        this.ordenDeTrabajoId = ordenDeTrabajoId;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public Double getCantidad() {
        return cantidad;
    }


    public Long getOrdenDeTrabajoId() {
        return ordenDeTrabajoId;
    }
}
