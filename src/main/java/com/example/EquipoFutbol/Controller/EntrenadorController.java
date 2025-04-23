package com.example.EquipoFutbol.Controller;

import com.example.EquipoFutbol.Model.Entrenador;
import com.example.EquipoFutbol.Service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @GetMapping
    public List<Entrenador> getAll() {
        return entrenadorService.getAll();
    }

    @PostMapping
    public Entrenador save(@RequestBody Entrenador entrenador) {
        return entrenadorService.save(entrenador);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entrenador> getById(@PathVariable Long id) {
        return entrenadorService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        entrenadorService.delete(id);
        return ResponseEntity.ok().build();
    }
}
