package com.jump.jump.model;

import jakarta.persistence.*;
//Empleado = (DNI(pk), Nombre, apellido, Correo, clave, idSucursal(fk)?)
@Entity
@Table (name = "empleado")
public class Empleado {
    @Id
    private String dni;

    private String nombre;
    private String apellido;
    private String correo;
    private String clave;

    @ManyToOne
    @JoinColumn(name = "idSucursal", nullable = false)
    private Sucursal sucursal;

    // Getters y Setters
}

