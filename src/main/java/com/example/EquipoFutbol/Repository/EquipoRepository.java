package com.example.EquipoFutbol.Repository;

import com.example.EquipoFutbol.Model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {

}
