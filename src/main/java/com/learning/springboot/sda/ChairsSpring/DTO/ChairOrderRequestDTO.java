package com.learning.springboot.sda.ChairsSpring.DTO;

import java.util.List;

public class ChairOrderRequestDTO {

    public String orderPersonName;
    public List<ChairOrderItemDTO> orderItems;

    @Override
    public String toString() {
        return "ChairOrderRequestDTO{" +
                "orderPersonName='" + orderPersonName + '\'' +
                ", orderItems=" + orderItems +
                '}';
    }
}
