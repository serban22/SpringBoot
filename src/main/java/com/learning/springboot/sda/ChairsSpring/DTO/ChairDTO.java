package com.learning.springboot.sda.ChairsSpring.DTO;

import java.util.List;

public class ChairDTO {

    String model;
    String tipLemn;
    List<ComponenteDTO> componente;

    public ChairDTO(String model, String tipLemn, List<ComponenteDTO> componente) {
        this.model = model;
        this.tipLemn = tipLemn;
        this.componente = componente;
    }

    public ChairDTO() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTipLemn() {
        return tipLemn;
    }

    public void setTipLemn(String tipLemn) {
        this.tipLemn = tipLemn;
    }

    public List<ComponenteDTO> getComponente() {
        return componente;
    }

    public void setComponente(List<ComponenteDTO> componente) {
        this.componente = componente;
    }

    @Override
    public String toString() {
        return "ChairDTO{" +
                "model='" + model + '\'' +
                ", tipLemn='" + tipLemn + '\'' +
                ", componente=" + componente +
                '}';
    }
}
