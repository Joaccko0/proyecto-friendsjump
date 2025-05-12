package com.jump.jump.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

//Evento = ( (idSucursal(fk), fecha)(pk), precio, cantInvitados, asistenciamenores )
@Entity
@Table (name = "evento")
public class Evento {
    @EmbeddedId
    private EventoId eventoId;

    @ManyToOne
    @MapsId("idSucursal")
    @JoinColumn (name = "idSucursal")
    private Sucursal sucursal;

    private BigDecimal precio;
    private int cantInvitados;
    private boolean asistenciamenores;
    private String descripcion;

    public Evento (){}
    public Evento (EventoId eventoId, BigDecimal precio, int cantInvitados,
                    boolean asistenciamenores, String descripcion){
        this.eventoId = eventoId;
        this.precio = precio;
        this.cantInvitados = cantInvitados;
        this.asistenciamenores = asistenciamenores;
        this.descripcion = descripcion;
    }
    public EventoId getEventoId() {
        return eventoId;
    }

    public void setEventoId(EventoId eventoId) {
        this.eventoId = eventoId;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getCantInvitados() {
        return cantInvitados;
    }

    public void setCantInvitados(int cantInvitados) {
        this.cantInvitados = cantInvitados;
    }

    public boolean isAsistenciamenores() {
        return asistenciamenores;
    }

    public void setAsistenciamenores(boolean asistenciamenores) {
        this.asistenciamenores = asistenciamenores;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
