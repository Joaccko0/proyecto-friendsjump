package com.jump.jump.model;
//propietario = (DNI(pk), Nombre, Apellido, correo, clave)

import jakarta.persistence.*;

@Entity
@Table (name = "propietario")
public class Propietario extends Persona {
    public Propietario(){
    }
    public Propietario (String dni, String nombre,String apellido,
                       String correo, String clave){
        super(dni, nombre, apellido, correo, clave);
    }
}
