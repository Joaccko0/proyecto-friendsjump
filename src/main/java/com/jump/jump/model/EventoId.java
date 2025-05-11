package com.jump.jump.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public class EventoId implements Serializable {
    private Long idSucursal;
    private LocalDate fecha;
}
