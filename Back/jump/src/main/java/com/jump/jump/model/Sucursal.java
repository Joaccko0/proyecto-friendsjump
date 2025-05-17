package com.jump.jump.model;
import jakarta.persistence.*;

//Sucursal = (idSucursal(pk), Avenida, calle, nro, telefono?, nombreCiudad))
@Entity
@Table (name = "sucursal")
public class Sucursal {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long idSucursal;

        private String avenida;
        private String calle;
        private String nro;
        private String telefono;
        private String nombreCiudad;



    public Sucursal(){}
    public Sucursal(String avenida, String calle, String nro, String telefono, String nombreCiudad){
        this.avenida = avenida;
        this.calle = calle;
        this.nro = nro;
        this.telefono = telefono;
        this.nombreCiudad = nombreCiudad;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
}
