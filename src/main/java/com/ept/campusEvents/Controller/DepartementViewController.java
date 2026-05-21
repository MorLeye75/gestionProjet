package com.ept.campusEvents.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.Valid;

import com.ept.campusEvents.DTO.DepartementDTO;
import com.ept.campusEvents.Service.DepartementService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/departements")
@RequiredArgsConstructor
public class DepartementViewController {

    private final DepartementService departementService;

    @GetMapping("/ajouter")
    public String showForm(Model model) {
        model.addAttribute("departementDTO", new DepartementDTO());
        return "departements/ajouter";
    }

    @PostMapping("/ajouter")
    public String submitForm(@Valid @ModelAttribute DepartementDTO departementDTO) {
        departementService.createDepartement(departementDTO);
        return "redirect:/departements/liste";
    }

    @GetMapping("/liste")
    public String liste(Model model) {
        model.addAttribute("departements", departementService.getAllDepartements());
        return "departements/liste";
    }
}