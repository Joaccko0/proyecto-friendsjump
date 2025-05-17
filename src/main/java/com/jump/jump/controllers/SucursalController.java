package com.jump.jump.controllers;

import com.jump.jump.model.Sucursal;
import com.jump.jump.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    // Obtener todas las sucursales
    @GetMapping
    public List<Sucursal> getAllSucursales() {
        return sucursalService.getAllSucursales();
    }

    // Obtener una sucursal por su ID
    @GetMapping("/{idSucursal}")
    public Sucursal getSucursalById(@PathVariable Long idSucursal) {
        return sucursalService.getByIdSucursal(idSucursal);
    }

    // Crear una nueva sucursal
    @PostMapping
    public Sucursal createSucursal(@RequestBody Sucursal sucursal) {
        sucursalService.saveSucursal(sucursal);
        return sucursal;
    }

    // Borrar una sucursal por ID
    @DeleteMapping("/{idSucursal}")
    public void deleteSucursal(@PathVariable Long idSucursal) {
        Sucursal sucursal = sucursalService.getByIdSucursal(idSucursal);
        if (sucursal != null) {
            sucursalService.deleteSucursal(sucursal);
        }
        // En un proyecto real, aquí conviene devolver un error si no se encuentra la sucursal
    }

    // Actualizar una sucursal existente
    @PutMapping("/{idSucursal}")
    public Sucursal updateSucursal(@PathVariable Long idSucursal, @RequestBody Sucursal sucursalDetails) {
        Sucursal sucursal = sucursalService.getByIdSucursal(idSucursal);
        if (sucursal != null) {
            sucursal.setAvenida(sucursalDetails.getAvenida());
            sucursal.setCalle(sucursalDetails.getCalle());
            sucursal.setNro(sucursalDetails.getNro());
            sucursal.setTelefono(sucursalDetails.getTelefono());
            sucursal.setNombreCiudad(sucursalDetails.getNombreCiudad());
            sucursalService.saveSucursal(sucursal);
            return sucursal;
        }
        // En un proyecto real, aquí conviene devolver un error si no se encuentra la sucursal
        return null;
    }
}