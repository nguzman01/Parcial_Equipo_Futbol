package com.example.EquipoFutbol.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor*/

@Entity
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_entrenador;
    private String nombreEntrenador;
    private String especialidad;


    //
    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

    // contructor


    public Entrenador() {
    }

    public Entrenador(Long id_entrenador, String nombreEntrenador, String especialidad, Equipo equipo) {
        this.id_entrenador = id_entrenador;
        this.nombreEntrenador = nombreEntrenador;
        this.especialidad = especialidad;
        this.equipo = equipo;
    }

    // geter y serter

    public Long getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(Long id_entrenador) {
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

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
