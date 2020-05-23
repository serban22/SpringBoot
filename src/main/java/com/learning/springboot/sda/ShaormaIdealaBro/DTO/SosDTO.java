package com.learning.springboot.sda.ShaormaIdealaBro.DTO;

public class SosDTO {

    String type;
    Integer quantity;

    public SosDTO(String type, Integer quantity) {
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
        return "SosDTO{" +
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
