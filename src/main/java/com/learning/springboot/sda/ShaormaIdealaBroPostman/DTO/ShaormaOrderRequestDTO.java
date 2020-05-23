package com.learning.springboot.sda.ShaormaIdealaBroPostman.DTO;

import java.util.List;

public class ShaormaOrderRequestDTO {

    public String orderPersonName;
    public List<ShaormaOrderItemDTO> orderItems;

    @Override
    public String toString() {
        return "ShaormaOrderRequestDTO{" +
                "orderPersonName='" + orderPersonName + '\'' +
                ", orderItems=" + orderItems +
                '}';
    }
}
