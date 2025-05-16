package com.jump.jump.model;

import jakarta.persistence.*;
//Empleado = (DNI(pk), Nombre, apellido, Correo, clave, idSucursal(fk)?)
@Entity
@Table (name = "empleado")
public class Empleado extends Persona{
    @ManyToOne
    @JoinColumn(name = "idSucursal", nullable = false)
    private Sucursal sucursal;

    public Empleado(){super();}
    public Empleado(String dni, String nombre,String apellido, String correo, String clave, Sucursal sucursal){
        super(dni, nombre,apellido ,correo, clave);
        this.sucursal = sucursal;

    }
    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Empleado{" +super.toString()+
                "sucursal=" + sucursal +
                '}';
    }
}

