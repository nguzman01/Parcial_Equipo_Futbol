package com.example.EquipoFutbol.Service;

import com.example.EquipoFutbol.Model.Equipo;
import com.example.EquipoFutbol.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public List<Equipo> getAll() {
        return equipoRepository.findAll();
    }

    public Equipo save(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public Optional<Equipo> getById(Long id) {
        return equipoRepository.findById(id);
    }

    public void delete(Long id) {
        equipoRepository.deleteById(id);
    }
}
