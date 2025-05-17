package com.jump.jump.repository;

import com.jump.jump.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  SucursalRepository  extends JpaRepository<Sucursal, Long> {
    //Implementar Más metodos de ser requerido
}

