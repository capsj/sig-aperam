package com.aperam.sig.proveedor;

import javax.persistence.*;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cuit")
    private Double cuit;


    public Proveedor() {

    }

    public Proveedor(String razonSocial, String nombre, Double cuit) {
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getRazonSocial() {
        return razonSocial;
    }

    public Double getCuit() {
        return cuit;
    }
}
