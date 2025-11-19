package com.egsf.spring.app.springboot_app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.egsf.spring.app.springboot_app.models.Empleados;



@Controller
public class EjemploController {

    @GetMapping("/info")
    public String getInfo(Model model) {
        Empleados empleado1 = new Empleados("Edwin", "Segura", "Calle 1 # 23", "Analista", 29, 3132344, 1);
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor","Egsf");
        model.addAttribute("Ip","192.168.1.1");
        model.addAttribute("info", empleado1);


        return "details_info";
    }
    
    @ModelAttribute("Empleados")
    public List<Empleados> listaEmpleados(){
        List<Empleados> lista = Arrays.asList(
            new Empleados("Edwin", "Segura", "Calle 1 23 - 110", "Analista", 29, 1234567, 1),
            new Empleados("Gloria", "Ordonez", "Calle 1 23 - 110", "Analista", 38, 1234567, 2),
            new Empleados("Maria", "Fernandez", "Cra 156D 136 - 17", "Empleado", 60, 1234567, 3),
            new Empleados("Abel", "Mateus", "Cra 156D 136 - 17", "Analista", 50, 1234567, 4),
            new Empleados("Avril", "Segura", "Calle 1 23 - 110", "Estudiante", 2, 1234567, 5)
            
        );

        return lista;
    }
}
