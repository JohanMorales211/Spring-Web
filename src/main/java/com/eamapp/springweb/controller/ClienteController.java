package com.eamapp.springweb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eamapp.springweb.models.Cliente;
import com.eamapp.springweb.models.Vendedores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;

@Controller

@RequestMapping("/cliente")
public class ClienteController {
    @GetMapping({"/",""})
    public String indexCliente(Model model){
        Cliente cliente = new Cliente();
        model.addAttribute("titulo", "Perfil");
        model.addAttribute("cliente", cliente);
        cliente.setNombre("Johan");
        cliente.setApellido("Morales");
        cliente.setEmail("morales.johan.8905@eam.edu.co");
        model.addAttribute("cuerpo", "perfil del cliente: ".concat(cliente.getNombre()));
        return "cliente/index";
    }

    @ModelAttribute("vendedores")
    public List<Vendedores> poblarVendedores(){
        List<Vendedores> vendedores = Arrays.asList(new Vendedores("Pepito","Perez","pepito@prueba.com"), new Vendedores("cosme","fulanito","cosme@prueba.com"));
        return vendedores;
    }
}
