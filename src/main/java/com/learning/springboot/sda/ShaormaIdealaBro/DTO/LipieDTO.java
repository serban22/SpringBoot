package com.learning.springboot.sda.ShaormaIdealaBro.DTO;

public class LipieDTO {

    String type;
    Integer price;
    private boolean vegan;

    public LipieDTO(String type, Integer price, boolean vegan) {
        this.type = type;
        this.price = price;
        this.vegan = vegan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    @Override
    public String toString() {
        return "LipieDTO{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", vegan=" + vegan +
                '}';
    }
}
