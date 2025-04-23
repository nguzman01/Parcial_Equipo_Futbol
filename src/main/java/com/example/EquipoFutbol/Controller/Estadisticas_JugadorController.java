package com.example.EquipoFutbol.Controller;

import com.example.EquipoFutbol.Model.Estadisticas_Jugador;
import com.example.EquipoFutbol.Service.Estadisticas_JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadisticas")
public class Estadisticas_JugadorController {

    @Autowired
    private Estadisticas_JugadorService estadisticasService;

    @GetMapping
    public List<Estadisticas_Jugador> getAll() {
        return estadisticasService.getAll();
    }

    @PostMapping
    public Estadisticas_Jugador save(@RequestBody Estadisticas_Jugador estadistica) {
        return estadisticasService.save(estadistica);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estadisticas_Jugador> getById(@PathVariable Long id) {
        return estadisticasService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        estadisticasService.delete(id);
        return ResponseEntity.ok().build();
    }
}

