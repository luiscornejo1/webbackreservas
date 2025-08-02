package com.zonificacion.backend.controller;

import com.zonificacion.backend.model.Reserva;
import com.zonificacion.backend.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    // GET /api/reservas
    @GetMapping
    public List<Reserva> getAll() { return reservaService.getAll(); }

    // POST /api/reservas
    @PostMapping
    public Reserva save(@RequestBody Reserva reserva) { return reservaService.save(reserva); }

    // PUT /api/reservas/{id}
    @PutMapping("/{id}")
    public Reserva update(@PathVariable Long id, @RequestBody Reserva reserva) {
        return reservaService.update(id, reserva);
    }
}