package com.example.EquipoFutbol.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor*/
@Entity
public class Estadisticas_Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_estadistica;

    @ManyToOne
    @JoinColumn(name = "id_jugador")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "id_partido")
    private Partido partido;

    private int minutos_juagados;
    private int goles;
    private int asistencias;
    private int tarjetas_amarillas;
    private int tarjetas_rojas;

    //


    public Estadisticas_Jugador() {
    }

    public Estadisticas_Jugador(Long id_estadistica, Jugador jugador, Partido partido, int minitos_juagados, int goles, int asistencias, int tarjetas_amarillas, int tarjetas_rojas) {
        this.id_estadistica = id_estadistica;
        this.jugador = jugador;
        this.partido = partido;
        this.minutos_juagados = minutos_juagados;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetas_amarillas = tarjetas_amarillas;
        this.tarjetas_rojas = tarjetas_rojas;
    }
    // geter y seter

    public Long getId_estadistica() {
        return id_estadistica;
    }

    public void setId_estadistica(Long id_estadistica) {
        this.id_estadistica = id_estadistica;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int getMinitos_juagados() {
        return minutos_juagados;
    }

    public void setMinitos_juagados(int minitos_juagados) {
        this.minutos_juagados = minitos_juagados;
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
