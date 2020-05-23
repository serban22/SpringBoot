package com.learning.springboot.sda.ShaormaIdealaBro.DTO;

import java.util.List;

public class ShaormaDTO {

    String name;
    String type;
    List<IngredientDTO> ingredients;
    ShaormarDTO shaormar;
    LipieDTO lipie;
    List<SosDTO> listSosuri;
    private boolean deToate;

    public ShaormaDTO(String name, String type, List<IngredientDTO> ingredients, ShaormarDTO shaormar, LipieDTO lipie, List<SosDTO> listSosuri, boolean deToate) {
        this.name = name;
        this.type = type;
        this.ingredients = ingredients;
        this.shaormar = shaormar;
        this.lipie = lipie;
        this.listSosuri = listSosuri;
        this.deToate = deToate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<IngredientDTO> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientDTO> ingredients) {
        this.ingredients = ingredients;
    }

    public ShaormarDTO getShaormar() {
        return shaormar;
    }

    public void setShaormar(ShaormarDTO shaormar) {
        this.shaormar = shaormar;
    }

    public LipieDTO getLipie() {
        return lipie;
    }

    public void setLipie(LipieDTO lipie) {
        this.lipie = lipie;
    }

    public List<SosDTO> getListSosuri() {
        return listSosuri;
    }

    public void setListSosuri(List<SosDTO> listSosuri) {
        this.listSosuri = listSosuri;
    }

    public boolean isDeToate() {
        return deToate;
    }

    public void setDeToate(boolean deToate) {
        this.deToate = deToate;
    }

    @Override
    public String toString() {
        return "ShaormaDTO{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", ingredients=" + ingredients +
                ", shaormar=" + shaormar +
                ", lipie=" + lipie +
                ", listSosuri=" + listSosuri +
                ", deToate=" + deToate +
                '}';
    }
}
