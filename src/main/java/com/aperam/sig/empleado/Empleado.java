package com.aperam.sig.empleado;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "legajo")
    private Double legajo;


    public Empleado() {

    }

    public Empleado(String nombre, String apellido, Double legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public Double getLegajo() {
        return legajo;
    }
}
