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
    public Propietario(){
    }
    public Propietario(String dni, String nombre,String apellido,
                       String correo, String clave){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.correo = correo;
    }

}
