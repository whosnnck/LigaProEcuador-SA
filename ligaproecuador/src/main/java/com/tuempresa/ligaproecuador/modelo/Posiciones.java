package com.tuempresa.ligaproecuador.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Posiciones {
	@Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    @DescriptionsList
    private NombresEquipos equipo;

    @Column
    @Required
    private int posicion;
    
    @Column
    @Required
    private int victorias;

    @Column
    @Required
    private int empates;

    @Column
    @Required
    private int derrotas;

    @Column
    @Required
    private int golesAFavor;
    
    @Column
    @Required
    private int golesEnContra;
    
    @Column
    @Required
    private int puntos;

    @Column
    @Required
    private int diferenciaGoles;
}
