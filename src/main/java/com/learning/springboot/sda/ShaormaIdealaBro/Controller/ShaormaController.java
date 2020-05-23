package com.learning.springboot.sda.ShaormaIdealaBro.Controller;

import com.learning.springboot.sda.ShaormaIdealaBro.DTO.ShaormaDTO;
import com.learning.springboot.sda.ShaormaIdealaBro.Service.ShaormaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShaormaController {

    @Autowired
    ShaormaService shaormaService;

    @GetMapping(value = "/omfg", produces = "application/json")
    public ResponseEntity<ShaormaDTO> getValue() {
        ShaormaDTO myShaorma = shaormaService.getShaorma("Shaorma de pui", "mare", "mare", true);
        return new ResponseEntity<>(myShaorma, HttpStatus.OK);
    }
}
