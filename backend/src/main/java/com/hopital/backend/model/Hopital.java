package com.hopital.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hopital {

    @Id
    private Long idHopital;
    private String nomHopital;
    private String adrHopital;

    public Hopital() {}

    public Hopital(Long idHopital, String nomHopital, String adrHopital) {
        this.idHopital = idHopital;
        this.nomHopital = nomHopital;
        this.adrHopital = adrHopital;
    }

    public Long getIdHopital() {
        return idHopital;
    }

    public void setIdHopital(Long idHopital) {
        this.idHopital = idHopital;
    }

    public String getNomHopital() {
        return nomHopital;
    }

    public void setNomHopital(String nomHopital) {
        this.nomHopital = nomHopital;
    }

    public String getAdrHopital() {
        return adrHopital;
    }

    public void setAdrHopital(String adrHopital) {
        this.adrHopital = adrHopital;
    }
}
