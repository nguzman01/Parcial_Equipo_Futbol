package com.example.EquipoFutbol.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor*/
@Entity
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_partido;
    private LocalDate fecha;
    private String estadio;
    private int goles_local;
    private int goles_visita;

    //

    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visita")
    private Equipo equipoVisita;

    @OneToMany(mappedBy = "partido", cascade = CascadeType.ALL)
    private List<Estadisticas_Jugador> estadisticas;

 // contructor

    public Partido() {
    }

    public Partido(Long id_partido, LocalDate fecha, String estadio, int goles_local, int goles_visita, Equipo equipoLocal, Equipo equipoVisita, List<Estadisticas_Jugador> estadisticas) {
        this.id_partido = id_partido;
        this.fecha = fecha;
        this.estadio = estadio;
        this.goles_local = goles_local;
        this.goles_visita = goles_visita;
        this.equipoLocal = equipoLocal;
        this.equipoVisita = equipoVisita;
        this.estadisticas = estadisticas;
    }

    public Long getId_partido() {
        return id_partido;
    }

    public void setId_partido(Long id_partido) {
        this.id_partido = id_partido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
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

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisita() {
        return equipoVisita;
    }

    public void setEquipoVisita(Equipo equipoVisita) {
        this.equipoVisita = equipoVisita;
    }

    public List<Estadisticas_Jugador> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<Estadisticas_Jugador> estadisticas) {
        this.estadisticas = estadisticas;
    }
}
