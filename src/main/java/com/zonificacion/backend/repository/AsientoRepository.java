package com.zonificacion.backend.repository;

import com.zonificacion.backend.model.Asiento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

public interface AsientoRepository extends JpaRepository<Asiento, Long> {
    Asiento findByCodigo(String codigo);
    List<Asiento> findByZona(String zona);

    @Modifying
    @Transactional
    void deleteByZona(String zona);
}