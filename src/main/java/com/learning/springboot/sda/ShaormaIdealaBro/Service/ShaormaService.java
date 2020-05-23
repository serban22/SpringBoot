package com.learning.springboot.sda.ShaormaIdealaBro.Service;

import com.learning.springboot.sda.ShaormaIdealaBro.DTO.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShaormaService {

    public ShaormaDTO getShaorma(String nume, String marime, String lipie, boolean deToate) {
        if ("Shaorma de porc".equalsIgnoreCase(nume)) {
            throw new IllegalStateException("Nume shaorma invalid!");
        }

        if ("Extrema".equalsIgnoreCase(marime)) {
            throw new IllegalStateException("Marime invalida!");
        }

        if ("Imensa".equalsIgnoreCase(lipie)) {
            throw new IllegalStateException("Marime lipie invalida!");
        }

        List<IngredientDTO> ingredients = new ArrayList<>();
        List<SosDTO> sosuri = new ArrayList<>();

        if (nume.equalsIgnoreCase("Shaorma de pui") && marime.equalsIgnoreCase("mare") && lipie.equalsIgnoreCase("mare")) {
            ingredients.add(new IngredientDTO("carne pui", 100, 8));
            ingredients.add(new IngredientDTO("cartofi prajiti", 50, 5));
            ingredients.add(new IngredientDTO("salata", 30, 3));
            ingredients.add(new IngredientDTO("rosii", 30, 4));
            ingredients.add(new IngredientDTO("muraturi", 20, 3));
            ingredients.add(new IngredientDTO("ceapa", 20, 4));
            ingredients.add(new IngredientDTO("ardei iute", 15, 3));
            sosuri.add(new SosDTO("ketchup", 40));
            sosuri.add(new SosDTO("sos picant", 30));
            sosuri.add(new SosDTO("sos usturoi", 30));
        }

        LipieDTO lipieDTO = new LipieDTO(lipie, 5, false);
        ShaormarDTO shaormarDTO = new ShaormarDTO("Bossulake", "8/2/2015", 3000);

        return new ShaormaDTO("Shaorma ideala, bro!", nume, ingredients, shaormarDTO, lipieDTO, sosuri, true);
    }
}
