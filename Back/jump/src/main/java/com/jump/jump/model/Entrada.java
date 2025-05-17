package com.jump.jump.model;

import jakarta.persistence.*;

//Entrada = ( (fecha, hora, idSucursal)(pk), nombreResponsable, apellidoResponsable,
//             cantidadIngresados, CorreoResponsableAsociado,
//             url-copiaContrato, dniEmpleado(fk)?, dniPropietario(fk)? )
@Entity
@Table (name = "entrada")
public class Entrada {
    @EmbeddedId
    private EntradaId entradaId;

    @ManyToOne
    @MapsId("idSucursal")
    @JoinColumn(name = "idSucursal")
    private Sucursal sucursal;

    private String nombreResponsable;
    private String apellidoResponsable;
    private int cantidadIngresados;
    private String correoResponsableAsociado;

    @ManyToOne
    @JoinColumn(name = "urlCopiaContrato")
    private CopiaContrato copiaContrato;

    @ManyToOne(optional = true)
    @JoinColumn(name = "dniEmpleado")
    private Empleado empleado;

    @ManyToOne(optional = true)
    @JoinColumn(name = "dniPropietario")
    private Propietario propietario;

    public Entrada(){}
    public Entrada(EntradaId entradaId,Sucursal sucursal, String nombreResponsable,
                   String apellidoResponsable, int cantidadIngresados,
                   String correoResponsableAsociado,CopiaContrato copiaContrato,
                   Empleado empleado, Propietario propietario){
        this.entradaId = entradaId;
        this.sucursal = sucursal;
        this.nombreResponsable = nombreResponsable;
        this.apellidoResponsable = apellidoResponsable;
        this.cantidadIngresados = cantidadIngresados;
        this.correoResponsableAsociado = correoResponsableAsociado;
        this.copiaContrato = copiaContrato;
        this.empleado = empleado;
        this.propietario = propietario;
    }
    public EntradaId getEntradaId() {
        return entradaId;
    }

    public void setEntradaId(EntradaId entradaId) {
        this.entradaId = entradaId;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getApellidoResponsable() {
        return apellidoResponsable;
    }

    public void setApellidoResponsable(String apellidoResponsable) {
        this.apellidoResponsable = apellidoResponsable;
    }

    public int getCantidadIngresados() {
        return cantidadIngresados;
    }

    public void setCantidadIngresados(int cantidadIngresados) {
        this.cantidadIngresados = cantidadIngresados;
    }

    public String getCorreoResponsableAsociado() {
        return correoResponsableAsociado;
    }

    public void setCorreoResponsableAsociado(String correoResponsableAsociado) {
        this.correoResponsableAsociado = correoResponsableAsociado;
    }

    public CopiaContrato getCopiaContrato() {
        return copiaContrato;
    }

    public void setCopiaContrato(CopiaContrato copiaContrato) {
        this.copiaContrato = copiaContrato;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}

