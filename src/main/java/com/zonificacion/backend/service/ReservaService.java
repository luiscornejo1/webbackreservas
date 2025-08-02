package com.zonificacion.backend.service;

import com.zonificacion.backend.model.Reserva;
import com.zonificacion.backend.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getAll() { return reservaRepository.findAll(); }
    public Reserva save(Reserva reserva) { return reservaRepository.save(reserva); }
    public Reserva update(Long id, Reserva reserva) {
        reserva.setId(id);
        return reservaRepository.save(reserva);
    }
}