package com.example.EquipoFutbol.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_juagador;
    private String nombreJugador;
    private String posicion;
    private int dorsal;
    private Date fecha_nac;
    private String nacionalidad;
    private int id_equipo;

    //constructor

    public Jugador() {
    }

    public Jugador(int id_juagador, String nombreJugador, String posicion, int dorsal, Date fecha_nac, String nacionalidad, int id_equipo) {
        this.id_juagador = id_juagador;
        this.nombreJugador = nombreJugador;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.id_equipo = id_equipo;
    }
    //seter y geter

    public int getId_juagador() {
        return id_juagador;
    }

    public void setId_juagador(int id_juagador) {
        this.id_juagador = id_juagador;
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

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }
}
