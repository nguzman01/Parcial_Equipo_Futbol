package com.example.EquipoFutbol.Service;

import com.example.EquipoFutbol.Model.Jugador;
import com.example.EquipoFutbol.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public List<Jugador> getAll() {
        return jugadorRepository.findAll();
    }

    public Jugador save(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public List<Jugador> getByEquipo(Long id) {
        return jugadorRepository.findByEquipo(id);
    }

    public List<Jugador> getGoleadores(int goles) {
        return jugadorRepository.findJugadoresConMasDeXGoles(goles);
    }
}
