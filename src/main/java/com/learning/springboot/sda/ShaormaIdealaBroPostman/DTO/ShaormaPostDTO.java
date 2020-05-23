package com.learning.springboot.sda.ShaormaIdealaBroPostman.DTO;

import java.util.List;

public class ShaormaPostDTO {

    String name;
    String type;
    List<IngredientPostDTO> ingredients;
    ShaormarPostDTO shaormar;
    LipiePostDTO lipie;
    SosPostDTO sosuri;
    private boolean deToate;

    public ShaormaPostDTO(String name, String type, List<IngredientPostDTO> ingredients, ShaormarPostDTO shaormar, LipiePostDTO lipie, SosPostDTO sosuri, boolean deToate) {
        this.name = name;
        this.type = type;
        this.ingredients = ingredients;
        this.shaormar = shaormar;
        this.lipie = lipie;
        this.sosuri = sosuri;
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

    public List<IngredientPostDTO> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientPostDTO> ingredients) {
        this.ingredients = ingredients;
    }

    public ShaormarPostDTO getShaormar() {
        return shaormar;
    }

    public void setShaormar(ShaormarPostDTO shaormar) {
        this.shaormar = shaormar;
    }

    public LipiePostDTO getLipie() {
        return lipie;
    }

    public void setLipie(LipiePostDTO lipie) {
        this.lipie = lipie;
    }

    public SosPostDTO getSosuri() {
        return sosuri;
    }

    public void setSosuri(SosPostDTO sosuri) {
        this.sosuri = sosuri;
    }

    public boolean isDeToate() {
        return deToate;
    }

    public void setDeToate(boolean deToate) {
        this.deToate = deToate;
    }

    public ShaormaPostDTO() {
    }

    @Override
    public String toString() {
        return "ShaormaPostDTO{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", ingredients=" + ingredients +
                ", shaormar=" + shaormar +
                ", lipie=" + lipie +
                ", sosuri=" + sosuri +
                ", deToate=" + deToate +
                '}';
    }
}
