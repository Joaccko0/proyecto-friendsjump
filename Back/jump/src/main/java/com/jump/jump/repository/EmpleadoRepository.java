package com.jump.jump.repository;

import com.jump.jump.model.Empleado;
import com.jump.jump.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
        //implementarMasMetodos de verlo necesario
         List<Empleado> findBySucursal_IdSucursal(Long idSucursal);
}
