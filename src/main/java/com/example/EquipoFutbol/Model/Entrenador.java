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
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_entrenador;
    private String nombreEntrenador;
    private String especialidad;
    private int id_equipo;

    //


    public Entrenador() {
    }

    public Entrenador(int id_entrenador, String nombreEntrenador, String especialidad, int id_equipo) {
        this.id_entrenador = id_entrenador;
        this.nombreEntrenador = nombreEntrenador;
        this.especialidad = especialidad;
        this.id_equipo = id_equipo;
    }

    // seter y geter


    public int getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(int id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }
}
