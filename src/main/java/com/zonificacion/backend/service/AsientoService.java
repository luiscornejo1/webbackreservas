package com.zonificacion.backend.service;

import com.zonificacion.backend.model.Asiento;
import com.zonificacion.backend.repository.AsientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AsientoService {
    @Autowired
    private AsientoRepository asientoRepository;

    public List<Asiento> getAll() { return asientoRepository.findAll(); }
    public Asiento save(Asiento asiento) { return asientoRepository.save(asiento); }
    public Asiento findByCodigo(String codigo) { return asientoRepository.findByCodigo(codigo); }
    public void delete(Long id) { asientoRepository.deleteById(id); }

    public Asiento findById(Long id) {
        return asientoRepository.findById(id).orElse(null);
    }

    public List<Asiento> findByZona(String zona) {
        return asientoRepository.findByZona(zona);
    }

    @Transactional
    public void deleteByZona(String zona) {
        asientoRepository.deleteByZona(zona);
    }
}