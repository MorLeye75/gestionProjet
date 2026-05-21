package com.ept.campusEvents.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ept.campusEvents.DTO.DepartementDTO;
import com.ept.campusEvents.Service.DepartementService;

import lombok.RequiredArgsConstructor;
import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/departements")    
@RequiredArgsConstructor
public class DepartementController {
    private final DepartementService departementService;

    @GetMapping
    public ResponseEntity<List<DepartementDTO>> getAllDepartements() {
        List<DepartementDTO> departements = departementService.getAllDepartements();
        return ResponseEntity.ok(departements);
    }


    @GetMapping("/{id}")
    public ResponseEntity<DepartementDTO> getDepartementById(@PathVariable Long id) {
        DepartementDTO departement = departementService.getDepartementById(id);
        return ResponseEntity.ok(departement);
    }

    @PostMapping("/ajouter")
    public ResponseEntity<DepartementDTO> createDepartement(@Valid @RequestBody DepartementDTO departementDTO) {
        DepartementDTO createdDepartement = departementService.createDepartement(departementDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDepartement);
    }   
    
  


}
