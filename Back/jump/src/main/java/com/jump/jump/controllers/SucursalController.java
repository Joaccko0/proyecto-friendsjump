package com.jump.jump.controllers;

import com.jump.jump.model.Sucursal;
import com.jump.jump.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.persistence.*;
import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @GetMapping
    public ResponseEntity<List<Sucursal>> getAllSucursales() {
        return ResponseEntity.ok(sucursalService.getAllSucursales());
    }

    @GetMapping("/{idSucursal}")
    public ResponseEntity<Sucursal> getSucursalById(@PathVariable Long idSucursal) {
        try {
            Sucursal sucursal = sucursalService.getByIdSucursal(idSucursal);
            return ResponseEntity.ok(sucursal);
        } catch (EntityNotFoundException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Sucursal> createSucursal(@RequestBody Sucursal sucursal) {
        Sucursal nueva = sucursalService.saveSucursal(sucursal);
        return ResponseEntity.ok(nueva);
    }

    @PutMapping("/{idSucursal}")
    public ResponseEntity<Sucursal> updateSucursal(@PathVariable Long idSucursal, @RequestBody Sucursal datosActualizados) {
        try {
            Sucursal actualizada = sucursalService.updateSucursal(idSucursal, datosActualizados);
            return ResponseEntity.ok(actualizada);
        } catch (EntityNotFoundException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idSucursal}")
    public ResponseEntity<Void> deleteSucursal(@PathVariable Long idSucursal) {
        try {
            sucursalService.deleteSucursal(idSucursal);
            return ResponseEntity.noContent().build();
        } catch (EntityNotFoundException ex) {
            return ResponseEntity.notFound().build();
        }
        // Si la lógica compleja de borrado falla, se puede manejar con otro tipo de excepción y devolver 409 o 400.
    }
}