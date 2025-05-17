package com.jump.jump.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class ContratoEventoId implements Serializable {

    private Long idSucursal;
    private LocalDate fecha;
    private String urlCopiaContrato;

    public ContratoEventoId() {}

    public ContratoEventoId(Long idSucursal, LocalDate fecha, String urlCopiaContrato) {
        this.idSucursal = idSucursal;
        this.fecha = fecha;
        this.urlCopiaContrato = urlCopiaContrato;
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

    public String getUrlCopiaContrato() {
        return urlCopiaContrato;
    }

    public void setUrlCopiaContrato(String urlCopiaContrato) {
        this.urlCopiaContrato = urlCopiaContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContratoEventoId)) return false;
        ContratoEventoId that = (ContratoEventoId) o;
        return Objects.equals(idSucursal, that.idSucursal) &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(urlCopiaContrato, that.urlCopiaContrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSucursal, fecha, urlCopiaContrato);
    }
}
