package com.example.EquipoFutbol.Service;

import com.example.EquipoFutbol.Model.Estadisticas_Jugador;
import com.example.EquipoFutbol.Repository.Estadisticas_JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Estadisticas_JugadorService {

    @Autowired
    private Estadisticas_JugadorRepository estadisticasJugadorRepository;

    public List<Estadisticas_Jugador> getAll() {
        return estadisticasJugadorRepository.findAll();
    }

    public Estadisticas_Jugador save(Estadisticas_Jugador estadistica) {
        return estadisticasJugadorRepository.save(estadistica);
    }

    public Optional<Estadisticas_Jugador> getById(Long id) {
        return estadisticasJugadorRepository.findById(id);
    }

    public void delete(Long id) {
        estadisticasJugadorRepository.deleteById(id);
    }
}
