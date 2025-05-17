package com.jump.jump.repository;

import com.jump.jump.model.Evento;
import com.jump.jump.model.EventoId;
import jdk.jfr.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventoRepository extends JpaRepository<Evento, EventoId> {
    // Método corregido para buscar por fecha e idSucursal
    Optional<Evento> findByEventoId_FechaAndEventoId_IdSucursal(LocalDate fecha, Long idSucursal);

    // Método corregido para buscar por fecha
    List<Evento> findByEventoId_Fecha(LocalDate fecha);

     List<Evento> findByEventoId_IdSucursal(Long sucursal);
}
