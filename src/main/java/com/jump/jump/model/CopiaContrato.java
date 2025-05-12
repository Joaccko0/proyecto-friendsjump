package com.jump.jump.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "copiaContrato")
public class CopiaContrato {
    @Id
    private String urlCopiaContrato;
    public CopiaContrato(){}
    public CopiaContrato(String urlCopiaContrato){
        this.urlCopiaContrato = urlCopiaContrato;
    }
    public String getUrlCopiaContrato() {
        return urlCopiaContrato;
    }

    public void setUrlCopiaContrato(String urlCopiaContrato) {
        this.urlCopiaContrato = urlCopiaContrato;
    }
}
