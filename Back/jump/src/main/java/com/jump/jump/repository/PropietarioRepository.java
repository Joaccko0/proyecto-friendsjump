package com.jump.jump.repository;

import com.jump.jump.model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, String> {
    //Implementar Metodos de ser requerido
}
