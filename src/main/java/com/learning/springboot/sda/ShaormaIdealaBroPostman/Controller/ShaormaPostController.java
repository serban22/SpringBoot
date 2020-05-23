package com.learning.springboot.sda.ShaormaIdealaBroPostman.Controller;

import com.learning.springboot.sda.ShaormaIdealaBroPostman.DTO.ShaormaOrderRequestDTO;
import com.learning.springboot.sda.ShaormaIdealaBroPostman.DTO.ShaormaPostDTO;
import com.learning.springboot.sda.ShaormaIdealaBroPostman.Service.ShaormaPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShaormaPostController {

    @Autowired
    ShaormaPostService shaormaPostService;

    @GetMapping(value = "/shaormaPost", produces = "application/json")
    public ResponseEntity<List<ShaormaPostDTO>> getValue() {
        List<ShaormaPostDTO> allShaormas = shaormaPostService.getAllShaormas();
        return new ResponseEntity<List<ShaormaPostDTO>>(allShaormas, HttpStatus.OK);
    }

    @PostMapping(value = "/shaormaPost", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ShaormaPostDTO>> createShaorma(@RequestBody ShaormaOrderRequestDTO orderRequest) {
        System.out.println(orderRequest.toString());
        List<ShaormaPostDTO> shaormaPostDTOS = shaormaPostService.saveShaormas(orderRequest);
        return new ResponseEntity<List<ShaormaPostDTO>>(shaormaPostDTOS, HttpStatus.OK);
    }
}
