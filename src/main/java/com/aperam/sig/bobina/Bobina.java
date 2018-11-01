package com.aperam.sig.bobina;

import javax.persistence.*;

@Entity
@Table(name = "bobina")
public class Bobina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    public Bobina() {

    }

    public Bobina(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
