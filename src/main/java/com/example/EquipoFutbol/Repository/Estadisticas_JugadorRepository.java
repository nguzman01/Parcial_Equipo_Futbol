package com.example.EquipoFutbol.Repository;

import com.example.EquipoFutbol.Model.Estadisticas_Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Estadisticas_JugadorRepository extends JpaRepository<Estadisticas_Jugador, Long> {
}
