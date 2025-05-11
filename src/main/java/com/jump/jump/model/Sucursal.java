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

}
