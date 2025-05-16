package com.jump.jump.repository;

import com.jump.jump.model.Evento;
import com.jump.jump.model.EventoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, EventoId> {
    //Implementar Más metodos de ser necesarios
}
