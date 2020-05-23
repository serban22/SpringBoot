package com.learning.springboot.sda.ShaormaIdealaBroPostman.DTO;

public class LipiePostDTO {

    String type;
    Integer price;
    private boolean vegan;

    public LipiePostDTO(String type, Integer price, boolean vegan) {
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

    public LipiePostDTO() {
    }

    @Override
    public String toString() {
        return "LipiePostDTO{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", vegan=" + vegan +
                '}';
    }
}
