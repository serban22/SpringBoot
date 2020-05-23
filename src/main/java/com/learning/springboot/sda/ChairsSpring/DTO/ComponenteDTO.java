package com.learning.springboot.sda.ChairsSpring.DTO;

public class ComponenteDTO {

    String nume;
    String material;
    Integer cantitate;

    public ComponenteDTO(String nume, String material, Integer cantitate) {
        this.nume = nume;
        this.material = material;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "ComponenteDTO{" +
                "nume='" + nume + '\'' +
                ", material='" + material + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
