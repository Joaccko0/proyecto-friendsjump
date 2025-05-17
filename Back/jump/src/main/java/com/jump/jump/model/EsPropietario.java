package com.jump.jump.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "es_propietario")
public class EsPropietario {

    @Id
    @ManyToOne
    @JoinColumn(name = "idSucursal") // Clave primaria y foránea
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "dni") // Clave foránea opcional
    private Propietario propietario;

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}

