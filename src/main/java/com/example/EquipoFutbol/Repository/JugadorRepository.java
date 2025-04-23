package com.example.EquipoFutbol.Repository;

import com.example.EquipoFutbol.Model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    @Query(value = "SELECT * FROM jugador WHERE id_equipo = :idEquipo", nativeQuery = true)
    List<Jugador> findByEquipo(@Param("idEquipo") Long idEquipo);

    @Query(value = """
        SELECT j.* FROM jugador j
        JOIN estadisticas_jugador e ON j.id_jugador = e.id_jugador
        GROUP BY j.id_jugador
        HAVING SUM(e.goles) > :minGoles
        """, nativeQuery = true)
    List<Jugador> findJugadoresConMasDeXGoles(@Param("minGoles") int minGoles);

}
