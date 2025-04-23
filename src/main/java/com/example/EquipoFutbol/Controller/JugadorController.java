package com.example.EquipoFutbol.Controller;

import com.example.EquipoFutbol.Model.Jugador;
import com.example.EquipoFutbol.Service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    @GetMapping
    public List<Jugador> getAll() {
        return jugadorService.getAll();
    }

    @PostMapping
    public Jugador save(@RequestBody Jugador jugador) {
        return jugadorService.save(jugador);
    }

    @GetMapping("/equipo/{id}")
    public List<Jugador> getByEquipo(@PathVariable Long id) {
        return jugadorService.getByEquipo(id);
    }

    @GetMapping("/goleadores")
    public List<Jugador> getGoleadores(@RequestParam int goles) {
        return jugadorService.getGoleadores(goles);
    }
}
