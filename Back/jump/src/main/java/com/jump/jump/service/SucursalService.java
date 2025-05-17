package com.jump.jump.service;

import com.jump.jump.model.Sucursal;
import com.jump.jump.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService {
    @Autowired
    public SucursalRepository sucursalRepository;

    public List<Sucursal> getAllSucursales() {
        return this.sucursalRepository.findAll();
    }
    public Sucursal getByIdSucursal(Long idSucursal){
        return this.sucursalRepository.findById(idSucursal).orElse(null);
    }
    public void deleteSucursal(Long idSucursal) {
        //Debe requerir borrado en cascada de Empleados y propietarios proximamente.
       // this.sucursalRepository.delete(sucursal);
    }
    public void saveSucursal(Sucursal sucursal){
        this.sucursalRepository.save(sucursal);
    }

}