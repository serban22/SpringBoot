package com.learning.springboot.sda.ShaormaIdealaBroPostman.Service;

import com.learning.springboot.sda.ShaormaIdealaBroPostman.DTO.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShaormaPostService {

    List<ShaormaPostDTO> shaormasPersisted = new ArrayList<>();

    public List<ShaormaPostDTO> saveShaormas(ShaormaOrderRequestDTO shaormaOrder) {
        List<ShaormaPostDTO> shaormasFromOrder = new ArrayList<>();

        for (ShaormaOrderItemDTO orderItem : shaormaOrder.orderItems) {
            for (int i = 0; i < orderItem.quantity; i++) {
                ShaormaPostDTO tempShaorma = new ShaormaPostDTO();
                List<IngredientPostDTO> ingredienteDTOS = parseIngredients(orderItem.shaormaName);
                tempShaorma.setIngredients(ingredienteDTOS);
                tempShaorma.setDeToate(orderItem.deToate);
                tempShaorma.setLipie(orderItem.lipie);
                tempShaorma.setName(orderItem.shaormaName);
                tempShaorma.setType(orderItem.type);
                tempShaorma.setShaormar(orderItem.shaormar);
                tempShaorma.setSosuri(orderItem.sosuri);

                shaormasFromOrder.add(tempShaorma);
                shaormasPersisted.add(tempShaorma);
            }
        }
        return shaormasFromOrder;
    }

    public List<IngredientPostDTO> parseIngredients(String shaormaName) {
        List<IngredientPostDTO> ingredienteDTOS = new ArrayList<>();
        switch (shaormaName) {
            case "Shaorma pui": {
                ingredienteDTOS.add(new IngredientPostDTO("Carne pui", 150, 6));
                ingredienteDTOS.add(new IngredientPostDTO("Castraveti", 30, 4));
                ingredienteDTOS.add(new IngredientPostDTO("Varza", 30, 4));
                ingredienteDTOS.add(new IngredientPostDTO("Salata", 30, 4));
                ingredienteDTOS.add(new IngredientPostDTO("Ceapa", 20, 3));
                ingredienteDTOS.add(new IngredientPostDTO("Ketchup", 20, 3));
                ingredienteDTOS.add(new IngredientPostDTO("Maioneza", 20, 3));
                return ingredienteDTOS;
            }
            case "Shaorma vita": {
                ingredienteDTOS.add(new IngredientPostDTO("Carne vita", 150, 6));
                ingredienteDTOS.add(new IngredientPostDTO("Castraveti", 25, 4));
                ingredienteDTOS.add(new IngredientPostDTO("Varza", 25, 4));
                ingredienteDTOS.add(new IngredientPostDTO("Salata", 28, 4));
                ingredienteDTOS.add(new IngredientPostDTO("Ceapa", 25, 3));
                ingredienteDTOS.add(new IngredientPostDTO("Ketchup", 30, 3));
                ingredienteDTOS.add(new IngredientPostDTO("Maioneza", 20, 3));
                return ingredienteDTOS;
            }
            case "Shaorma amestec": {
                ingredienteDTOS.add(new IngredientPostDTO("Carne vita", 75, 3));
                ingredienteDTOS.add(new IngredientPostDTO("Carne pui", 75, 3));
                ingredienteDTOS.add(new IngredientPostDTO("Castraveti", 35, 5));
                ingredienteDTOS.add(new IngredientPostDTO("Varza", 20, 4));
                ingredienteDTOS.add(new IngredientPostDTO("Salata", 25, 4));
                ingredienteDTOS.add(new IngredientPostDTO("Ceapa", 25, 3));
                ingredienteDTOS.add(new IngredientPostDTO("Ketchup", 30, 3));
                ingredienteDTOS.add(new IngredientPostDTO("Maioneza", 20, 3));
                return ingredienteDTOS;
            }
        }
        return ingredienteDTOS;
    }

    public List<ShaormaPostDTO> getAllShaormas() {
        return shaormasPersisted;
    }
}
