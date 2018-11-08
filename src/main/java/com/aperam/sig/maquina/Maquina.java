package com.aperam.sig.maquina;

import javax.persistence.*;

@Entity
@Table(name = "maquina")
public class Maquina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "serie")
    private String serie;
    @Column(name = "nombre")
    private String nombre;

    public Maquina() {

    }

    public Maquina(String serie, String nombre) {
        this.serie = serie;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getSerie() {
        return serie;
    }

}
