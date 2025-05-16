package com.jump.jump.service;

import com.jump.jump.model.Empleado;
import com.jump.jump.model.Sucursal;
import com.jump.jump.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService
{
    @Autowired
    public EmpleadoRepository empleadoRepository;
    public List<Empleado> getAllEmpleado (){
        return this.empleadoRepository.findAll();
    }
    public Empleado findByDNIEmpleado(String dni){
        return this.empleadoRepository.findById(dni).orElse(null);
    }
    public List<Empleado> getAllEmpleadoBySucursal(Long idSucursal){
        return this.empleadoRepository.findBySucursal_IdSucursal(idSucursal);
    }
    public void saveEmpleado(Empleado empleado){
        this.empleadoRepository.save(empleado);
    }
}
