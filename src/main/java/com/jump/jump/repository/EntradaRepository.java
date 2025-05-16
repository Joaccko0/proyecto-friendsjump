package com.jump.jump.repository;

import com.jump.jump.model.Entrada;
import com.jump.jump.model.EntradaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaRepository extends JpaRepository<Entrada, EntradaId> {
    //Definir si se requieren más metodos.
}

