package com.example.EquipoFutbol.Service;

import com.example.EquipoFutbol.Model.Partido;
import com.example.EquipoFutbol.Repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class PartidoService {

    @Autowired
    private PartidoRepository partidoRepository;

    public List<Partido> getAll() {
        return partidoRepository.findAll();
    }

    public Partido save(Partido partido) {
        return partidoRepository.save(partido);
    }

    public Optional<Partido> getById(Long id) {
        return partidoRepository.findById(id);
    }

    public void delete(Long id) {
        partidoRepository.deleteById(id);
    }

    public Integer getTotalGoles(Long equipoId) {
        return partidoRepository.totalGolesEquipo(equipoId);
    }

    public List<Map<String, Object>> getResultados() {
        return partidoRepository.resultados();
    }
}

