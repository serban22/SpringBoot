package com.learning.springboot.sda.ChairsSpring.Controller;

import com.learning.springboot.sda.ChairsSpring.DTO.ChairDTO;
import com.learning.springboot.sda.ChairsSpring.DTO.ChairOrderRequestDTO;
import com.learning.springboot.sda.ChairsSpring.Service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChairController {

    @Autowired
    ChairService chairService;

    @GetMapping(value = "/chairs", produces = "application/json")
    public ResponseEntity<List<ChairDTO>> getValue() {
        List<ChairDTO> allChairs = chairService.getAllChairs();
        return new ResponseEntity<List<ChairDTO>>(allChairs, HttpStatus.OK);
    }

    @PostMapping(value = "/chairs", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ChairDTO>> createChair(@RequestBody ChairOrderRequestDTO orderRequest) {
        System.out.println(orderRequest.toString());
        List<ChairDTO> chairDTOS = chairService.saveChairs(orderRequest);
        return new ResponseEntity<List<ChairDTO>>(chairDTOS, HttpStatus.OK);
    }
}
