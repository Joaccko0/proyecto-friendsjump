package com.jump.jump.repository;

import com.jump.jump.model.ContratoEvento;
import com.jump.jump.model.ContratoEventoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoEventoRepository extends JpaRepository<ContratoEvento, ContratoEventoId> {
    //Implementar más metodos de ser necesarios.
}
