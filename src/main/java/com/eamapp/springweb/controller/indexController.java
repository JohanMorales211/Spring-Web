package com.eamapp.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class indexController {
    @GetMapping({"/","","/index"})
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring boot");
        model.addAttribute("titulo2", "Otro texto de Spring boot");
        return "index";
    }


    @GetMapping("/app")
    public String contactenos(Model model){
        model.addAttribute("mensaje", "¿En que te podemos ayudar?");
        return "contactar";
    }
}
