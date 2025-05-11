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
    public Propietario (String dni, String nombre,String apellido,
                       String correo, String clave){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
