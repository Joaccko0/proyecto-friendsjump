package com.jump.jump.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "esPropietario")
public class EsPropietario {

    @Id
    @ManyToOne
    @JoinColumn(name = "idSucursal", nullable = false) // Clave primaria y foránea
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "dni", nullable = true) // Clave foránea opcional
    private Propietario propietario;

    // Getters y setters
}

