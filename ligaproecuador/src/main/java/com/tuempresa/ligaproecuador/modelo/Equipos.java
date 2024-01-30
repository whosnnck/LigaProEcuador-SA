package com.tuempresa.ligaproecuador.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Equipos {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @DescriptionsList
    private NombresEquipos nombreEquipos;

    @Column(length = 50)
    @Required
    private String ciudad;

    @Column(length = 50)
    @Required
    private String entrenador;

    @Column(length = 50)
    @Required
    private String estadio;

    @Column
    @Required
    private int capacidad;

    @Files
    @Column(length = 255)
    private String foto;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Jugadores> jugadores;

}
