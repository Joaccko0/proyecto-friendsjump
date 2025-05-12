package com.jump.jump.model;
import java.util.*;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public class EventoId implements Serializable {

    private Long idSucursal;
    private LocalDate fecha;

    public EventoId() {}

    public EventoId(Long idSucursal, LocalDate fecha) {
        this.idSucursal = idSucursal;
        this.fecha = fecha;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventoId)) return false;
        EventoId that = (EventoId) o;
        return Objects.equals(idSucursal, that.idSucursal) &&
                Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSucursal, fecha);
    }
}
