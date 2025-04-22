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
public class Estadisticas_Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_estadistica;
    private int id_jugador;
    private int id_partido;
    private int minitos_juagados;
    private int goles;
    private int asistencias;
    private int tarjetas_amarillas;
    private int tarjetas_rojas;

    //


    public Estadisticas_Jugador() {
    }

    public Estadisticas_Jugador(int id_estadistica, int id_jugador, int id_partido, int minitos_juagados, int goles, int asistencias, int tarjetas_amarillas, int tarjetas_rojas) {

        this.id_estadistica = id_estadistica;
        this.id_jugador = id_jugador;
        this.id_partido = id_partido;
        this.minitos_juagados = minitos_juagados;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetas_amarillas = tarjetas_amarillas;
        this.tarjetas_rojas = tarjetas_rojas;
    }

    //

    public int getId_estadistica() {
        return id_estadistica;
    }

    public void setId_estadistica(int id_estadistica) {
        this.id_estadistica = id_estadistica;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public int getMinitos_juagados() {
        return minitos_juagados;
    }

    public void setMinitos_juagados(int minitos_juagados) {
        this.minitos_juagados = minitos_juagados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getTarjetas_amarillas() {
        return tarjetas_amarillas;
    }

    public void setTarjetas_amarillas(int tarjetas_amarillas) {
        this.tarjetas_amarillas = tarjetas_amarillas;
    }

    public int getTarjetas_rojas() {
        return tarjetas_rojas;
    }

    public void setTarjetas_rojas(int tarjetas_rojas) {
        this.tarjetas_rojas = tarjetas_rojas;
    }
}
