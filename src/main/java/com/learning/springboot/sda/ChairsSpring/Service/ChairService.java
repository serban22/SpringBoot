package com.learning.springboot.sda.ChairsSpring.Service;

import com.learning.springboot.sda.ChairsSpring.DTO.ChairDTO;
import com.learning.springboot.sda.ChairsSpring.DTO.ChairOrderItemDTO;
import com.learning.springboot.sda.ChairsSpring.DTO.ChairOrderRequestDTO;
import com.learning.springboot.sda.ChairsSpring.DTO.ComponenteDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChairService {

    List<ChairDTO> chairsPersisted = new ArrayList<>();

    public List<ChairDTO> saveChairs(ChairOrderRequestDTO chairOrder) {
        List<ChairDTO> chairsFromOrder = new ArrayList<>();

        for (ChairOrderItemDTO orderItem : chairOrder.orderItems) {
            for (int i = 0; i < orderItem.quantity; i++) {
                ChairDTO tempChair = new ChairDTO();
                List<ComponenteDTO> componenteDTOS = parseComponents(orderItem.chairName);
                tempChair.setComponente(componenteDTOS);
                tempChair.setModel(orderItem.chairName);
                tempChair.setTipLemn(orderItem.lemn);

                chairsFromOrder.add(tempChair);
                chairsPersisted.add(tempChair);
            }
        }
        return chairsFromOrder;
    }

    public List<ComponenteDTO> parseComponents(String chairName) {
        List<ComponenteDTO> componenteDTOS = new ArrayList<>();
        switch (chairName) {
            case "Scaun bucatarie": {
                componenteDTOS.add(new ComponenteDTO("Spatar", "mahon", 1));
                componenteDTOS.add(new ComponenteDTO("Sezut", "mahon", 1));
                componenteDTOS.add(new ComponenteDTO("Picioare", "mahon", 3));
                return componenteDTOS;
            }
            case "Scaun dormitor": {
                componenteDTOS.add(new ComponenteDTO("Spatar", "plop", 1));
                componenteDTOS.add(new ComponenteDTO("Sezut", "plop", 1));
                componenteDTOS.add(new ComponenteDTO("Picioare", "plop", 4));
                return componenteDTOS;
            }
            case "Scaun birou": {
                componenteDTOS.add(new ComponenteDTO("Spatar", "piele", 1));
                componenteDTOS.add(new ComponenteDTO("Sezut", "piele", 1));
                componenteDTOS.add(new ComponenteDTO("Roti", "plastic", 5));
                return componenteDTOS;
            }
        }
        return componenteDTOS;
    }

    public List<ChairDTO> getAllChairs() {
        return chairsPersisted;
    }

}
