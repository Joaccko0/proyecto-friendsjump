package com.jump.jump.repository;

import com.jump.jump.model.ContratoEvento;
import com.jump.jump.model.ContratoEventoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ContratoEventoRepository extends JpaRepository<ContratoEvento, ContratoEventoId> {
    // Método corregido para buscar por fecha
    List<ContratoEvento> findById_Fecha(LocalDate fecha);

    // Si necesitas buscar por más propiedades de ContratoEventoId:
    List<ContratoEvento> findById_FechaAndId_IdSucursal(LocalDate fecha, Long idSucursal);
}
