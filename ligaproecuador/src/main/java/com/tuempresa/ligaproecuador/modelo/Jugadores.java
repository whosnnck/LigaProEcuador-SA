package com.tuempresa.ligaproecuador.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Jugadores {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    @Required
    private String nombre;

    @Column(length = 50)
    @Required
    private String nacionalidad;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipos equipo;

    @Column(length = 50)
    @Required
    private String posicion;

    @Column(length = 50)
    @Required
    private String ultimoEquipo;

    @Column(length = 50)
    @Required
    private String dorsal;

    @Column
    @Required
    private int edad;

    @Stereotype("MEMO")
    private String observaciones;

}
