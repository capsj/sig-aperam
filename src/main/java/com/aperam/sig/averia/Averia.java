package com.aperam.sig.averia;

import com.aperam.sig.empleado.Empleado;
import com.aperam.sig.maquina.Maquina;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "averia")
public class Averia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "fecha")
    private Timestamp fecha;
    @Column(name = "tiempo_parado")
    private Integer tiempoParado;
    @ManyToOne
    private Maquina maquina;
    @ManyToOne
    private Empleado empleado;

    public Averia() {

    }

    public Averia(Timestamp fecha, Integer tiempoParado, Maquina maquina, Empleado empleado) {
        this.fecha = fecha;
        this.tiempoParado = tiempoParado;
        this.maquina = maquina;
        this.empleado = empleado;
    }

    public Long getId() {
        return id;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public Integer getTiempoParado() {
        return tiempoParado;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
}
