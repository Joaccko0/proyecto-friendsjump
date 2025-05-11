package com.jump.jump.model;
//ropietario = (DNI(pk), Nombre, Apellido, correo, clave)

import jakarta.persistence.*;

@Entity
@Table (name = "propietario")
public class Propietario {
    @Id
    private String dni;

    private String nombre;
    private String apellido;
    private String correo;
    private String clave;
}
