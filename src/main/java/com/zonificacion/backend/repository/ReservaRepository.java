package com.zonificacion.backend.repository;

import com.zonificacion.backend.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}