package com.example.EquipoFutbol.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor*/
@Entity

public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_jugador;
    private String nombreJugador;
    private String posicion;
    private int dorsal;
    private LocalDate fecha_nac;
    private String nacionalidad;


    //constructor

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL)
    private List<Estadisticas_Jugador> estadisticas;

    // contructor

    public Jugador() {
    }

    public Jugador(Long id_jugador, String nombreJugador, String posicion, int dorsal, LocalDate fecha_nac, String nacionalidad, Equipo equipo, List<Estadisticas_Jugador> estadisticas) {
        this.id_jugador = id_jugador;
        this.nombreJugador = nombreJugador;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.equipo = equipo;
        this.estadisticas = estadisticas;
    }

    // geter seter


    public Long getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(Long id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<Estadisticas_Jugador> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<Estadisticas_Jugador> estadisticas) {
        this.estadisticas = estadisticas;
    }
}
