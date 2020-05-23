package com.learning.springboot.sda.ShaormaIdealaBroPostman.DTO;

public class SosPostDTO {

    String type;
    Integer quantity;

    public SosPostDTO(String type, Integer quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SosPostDTO{" +
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
