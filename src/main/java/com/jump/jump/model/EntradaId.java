package com.jump.jump.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Embeddable
public class EntradaId implements Serializable {

    private LocalDate fecha;
    private LocalTime hora;

    private Long idSucursal;


    public EntradaId(){}
    public EntradaId(LocalDate fecha, LocalTime hora, Long idSucursal){
        this.fecha = fecha;
        this.hora = hora;
        this.idSucursal = idSucursal;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EntradaId entradaId = (EntradaId) o;
        return Objects.equals(fecha, entradaId.fecha) && Objects.equals(hora, entradaId.hora) && Objects.equals(idSucursal, entradaId.idSucursal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, hora, idSucursal);
    }


}

