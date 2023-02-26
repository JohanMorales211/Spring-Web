package com.eamapp.springweb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eamapp.springweb.models.Profesor;
import com.eamapp.springweb.models.Estudiantes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;

@Controller

@RequestMapping("/profesor")
public class ProfesorController {
    @GetMapping({"/",""})
    public String indexProfesor(Model model){
        Profesor profesor = new Profesor();
        model.addAttribute("titulo", "Perfil");
        model.addAttribute("profesor", profesor);
        profesor.setNombre("Johan");
        profesor.setApellido("Morales");
        profesor.setEmail("morales.johan.8905@eam.edu.co");
        model.addAttribute("cuerpo", "perfil del profesor: ".concat(profesor.getNombre()));
        return "profesor/index";
    }

    @ModelAttribute("vendedores")
    public List<Estudiantes> poblarEstudiantes(){
        List<Estudiantes> vendedores = Arrays.asList(new Estudiantes("Pepito","Perez","pepito@prueba.com"), new Estudiantes("cosme","fulanito","cosme@prueba.com"));
        return vendedores;
    }
}
