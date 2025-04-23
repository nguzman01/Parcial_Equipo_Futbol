package com.example.EquipoFutbol.Repository;

import com.example.EquipoFutbol.Model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Long> {

    @Query(value = """
        SELECT SUM(goles_local) + SUM(goles_visita) as total
        FROM partido
        WHERE equipo_local = :id OR equipo_visita = :id
        """, nativeQuery = true)
    Integer totalGolesEquipo(@Param("id") Long equipoId);

    @Query(value = """
        SELECT p.id_partido, e1.nombre AS local, p.goles_local, p.goles_visita, e2.nombre AS visitante
        FROM partido p
        JOIN equipo e1 ON p.equipo_local = e1.id_equipo
        JOIN equipo e2 ON p.equipo_visita = e2.id_equipo
        """, nativeQuery = true)
    List<Map<String, Object>> resultados();
}

