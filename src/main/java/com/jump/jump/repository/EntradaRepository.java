package com.jump.jump.repository;

import com.jump.jump.model.Entrada;
import com.jump.jump.model.EntradaId;
import com.jump.jump.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EntradaRepository extends JpaRepository<Entrada, EntradaId> {
 // Método corregido para buscar por rango de fechas
 List<Entrada> findByEntradaId_FechaBetween(LocalDate startDate, LocalDate endDate);

 // Otros métodos
 List<Entrada> findBySucursal(Sucursal sucursal);

 List<Entrada> findByCorreoResponsableAsociado(String correoResponsableAsociado);

 Optional<Entrada> findByCorreoResponsableAsociadoAndEntradaId_Fecha(String correoResponsableAsociado, LocalDate fecha);

 List<Entrada> findByEntradaId_Fecha(LocalDate fecha);
}