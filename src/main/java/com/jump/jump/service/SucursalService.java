package com.jump.jump.service;

import com.jump.jump.model.Sucursal;
import com.jump.jump.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SucursalService {
    @Autowired
    private SucursalRepository sucursalRepository;

    public List<Sucursal> getAllSucursales() {
        return sucursalRepository.findAll();
    }

    public Sucursal getByIdSucursal(Long idSucursal){
        return sucursalRepository.findById(idSucursal)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Sucursal no encontrada con id: " + idSucursal));
    }

    public Sucursal saveSucursal(Sucursal sucursal){
        return sucursalRepository.save(sucursal);
    }

    public Sucursal updateSucursal(Long idSucursal, Sucursal datosActualizados){
        Sucursal sucursal = getByIdSucursal(idSucursal);
        sucursal.setAvenida(datosActualizados.getAvenida());
        sucursal.setCalle(datosActualizados.getCalle());
        sucursal.setNro(datosActualizados.getNro());
        sucursal.setTelefono(datosActualizados.getTelefono());
        sucursal.setNombreCiudad(datosActualizados.getNombreCiudad());
        return sucursalRepository.save(sucursal);
    }

    public void deleteSucursal(Long idSucursal) {
        Sucursal sucursal = getByIdSucursal(idSucursal);
        //Debe requerir borrado en cascada de Empleados y propietarios proximamente.
        sucursalRepository.delete(sucursal);
    }
}
