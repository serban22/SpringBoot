package com.learning.springboot.sda.ChairsSpring.DTO;

public class ChairOrderItemDTO {

    public String chairName;
    public int quantity;
    public String lemn;

    @Override
    public String toString() {
        return "ChairOrderItemDTO{" +
                "chairName='" + chairName + '\'' +
                ", quantity=" + quantity +
                ", lemn='" + lemn + '\'' +
                '}';
    }
}
