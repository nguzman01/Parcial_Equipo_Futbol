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
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_partido;
    private Date fecha;
    private String estadio;
    private String ciudad;
    private int equipo_local;
    private int equipo_visita;
    private int goles_local;
    private int goles_visita;

    // contructor


    public Partido() {
    }

    public Partido(int id_partido, Date fecha, String estadio, String ciudad, int equipo_local, int equipo_visita, int goles_local, int goles_visita) {
        this.id_partido = id_partido;
        this.fecha = fecha;
        this.estadio = estadio;
        this.ciudad = ciudad;
        this.equipo_local = equipo_local;
        this.equipo_visita = equipo_visita;
        this.goles_local = goles_local;
        this.goles_visita = goles_visita;
    }

    // seter y geter


    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEquipo_local() {
        return equipo_local;
    }

    public void setEquipo_local(int equipo_local) {
        this.equipo_local = equipo_local;
    }

    public int getEquipo_visita() {
        return equipo_visita;
    }

    public void setEquipo_visita(int equipo_visita) {
        this.equipo_visita = equipo_visita;
    }

    public int getGoles_local() {
        return goles_local;
    }

    public void setGoles_local(int goles_local) {
        this.goles_local = goles_local;
    }

    public int getGoles_visita() {
        return goles_visita;
    }

    public void setGoles_visita(int goles_visita) {
        this.goles_visita = goles_visita;
    }
}
