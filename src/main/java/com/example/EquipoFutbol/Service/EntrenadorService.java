package com.example.EquipoFutbol.Service;

import com.example.EquipoFutbol.Model.Entrenador;
import com.example.EquipoFutbol.Repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrenadorService {

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public List<Entrenador> getAll() {
        return entrenadorRepository.findAll();
    }

    public Entrenador save(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    public Optional<Entrenador> getById(Long id) {
        return entrenadorRepository.findById(id);
    }

    public void delete(Long id) {
        entrenadorRepository.deleteById(id);
    }
}
