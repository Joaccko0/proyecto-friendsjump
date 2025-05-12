package com.jump.jump.model;

import jakarta.persistence.*;

//Asociación contrato-Evento = ( (idSucursal(fk), fecha, url-copiaContrato(fk))(pk) )
@Entity
@Table (name = "contrato-evento")
public class ContratoEvento {

        @EmbeddedId
        private ContratoEventoId id;

        @ManyToOne
        @MapsId("idSucursal")
        @JoinColumn(name = "idSucursal")
        private Sucursal sucursal;

        @ManyToOne
        @MapsId("fecha")
        @JoinColumns({
                @JoinColumn(name = "idSucursal", referencedColumnName = "idSucursal", insertable = false, updatable = false),
                @JoinColumn(name = "fecha", referencedColumnName = "fecha")
        })
        private Evento evento;

        @ManyToOne
        @MapsId("urlCopiaContrato")
        @JoinColumn(name = "urlCopiaContrato")
        private CopiaContrato copiaContrato;


        public ContratoEvento(){}

        public ContratoEvento(ContratoEventoId contratoEventoId){
            this.id = contratoEventoId;
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
