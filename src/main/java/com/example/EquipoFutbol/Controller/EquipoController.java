package com.example.EquipoFutbol.Controller;

import com.example.EquipoFutbol.Model.Equipo;
import com.example.EquipoFutbol.Service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping
    public List<Equipo> getAll() {
        return equipoService.getAll();
    }

    @PostMapping
    public Equipo save(@RequestBody Equipo equipo) {
        return equipoService.save(equipo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipo> getById(@PathVariable Long id) {
        return equipoService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        equipoService.delete(id);
        return ResponseEntity.ok().build();
    }
}
