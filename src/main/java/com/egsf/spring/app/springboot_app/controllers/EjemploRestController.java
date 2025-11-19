package com.egsf.spring.app.springboot_app.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.egsf.spring.app.springboot_app.models.Empleados;
import com.egsf.spring.app.springboot_app.models.dto.ClaseDTO;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@RestController
@RequestMapping(path = "/api")
public class EjemploRestController {

    
    @GetMapping(path = "/")
    public Map<String, Object> getMethgetInfo() {
        
        Empleados empleado1 = new Empleados("Edwin", "Segura", "Calle 1 23", "Analista", 29, 3132344, 1);
        
        Map<String,Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Servidor", "Server EGSF");
        respuesta.put("Ip", "192.168.1.1");
        respuesta.put("Informacion", empleado1);
        return respuesta;
    }

    @GetMapping("/empleado")
    public ClaseDTO getEmpleado() {
        ClaseDTO usuario = new ClaseDTO("Ingeniero", "esegura");
        return usuario;
    }
    
    
}
