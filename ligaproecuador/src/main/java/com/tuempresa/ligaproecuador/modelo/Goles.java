package com.tuempresa.ligaproecuador.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity	@Getter @Setter
public class Goles {
	@Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "jugador_id")
    @DescriptionsList(descriptionProperties = "nombre")
    private Jugadores jugador;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    @DescriptionsList
    private NombresEquipos equipo;

    @Required
    @Column(length = 10)
    private int goles;
}
