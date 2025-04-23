package com.example.EquipoFutbol.Controller;

import com.example.EquipoFutbol.Model.Partido;
import com.example.EquipoFutbol.Service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/partidos")
public class PartidoController {

    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public List<Partido> getAll() {
        return partidoService.getAll();
    }

    @PostMapping
    public Partido save(@RequestBody Partido partido) {
        return partidoService.save(partido);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Partido> getById(@PathVariable Long id) {
        return partidoService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        partidoService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/goles-totales/{idEquipo}")
    public Integer getGolesTotales(@PathVariable Long idEquipo) {
        return partidoService.getTotalGoles(idEquipo);
    }

    @GetMapping("/resultados")
    public List<Map<String, Object>> getResultados() {
        return partidoService.getResultados();
    }
}
