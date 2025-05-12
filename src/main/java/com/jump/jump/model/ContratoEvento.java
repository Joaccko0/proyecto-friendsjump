package com.jump.jump.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contrato_evento") // corregido el guion
public class ContratoEvento {

    @EmbeddedId
    private ContratoEventoId id;

    @ManyToOne
    @MapsId("idSucursal") // se mapea porque está en el ID
    @JoinColumn(name = "idSucursal")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "idSucursal", referencedColumnName = "idSucursal", insertable = false, updatable = false),
            @JoinColumn(name = "fecha", referencedColumnName = "fecha", insertable = false, updatable = false)
    })
    private Evento evento;

    @ManyToOne
    @MapsId("urlCopiaContrato") // también está en el ID
    @JoinColumn(name = "urlCopiaContrato")
    private CopiaContrato copiaContrato;

    public ContratoEvento() {}

    public ContratoEvento(ContratoEventoId id) {
        this.id = id;
    }

    public ContratoEventoId getId() {
        return id;
    }

    public void setId(ContratoEventoId id) {
        this.id = id;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public CopiaContrato getCopiaContrato() {
        return copiaContrato;
    }

    public void setCopiaContrato(CopiaContrato copiaContrato) {
        this.copiaContrato = copiaContrato;
    }
}
