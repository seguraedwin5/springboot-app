package com.egsf.spring.app.springboot_app.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.egsf.spring.app.springboot_app.models.Empleados;
import com.egsf.spring.app.springboot_app.models.dto.ParametroDTO;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.valores}")
    private String[] valores;
    
    @GetMapping("/pagina/{info}")
    public ParametroDTO getMensaje(@PathVariable String info) {
        ParametroDTO detalle = new ParametroDTO();
        detalle.setInformacion(info);

        return detalle;
    }
    
    @PostMapping("/empleado")
    public Empleados crearEmpleado(@RequestBody Empleados empleado) {
        System.out.println("empleado creado"+empleado.toString());
        
        return empleado;
    }

    @GetMapping("/valores")
    public Map<String,Object> getValores() {
        Map<String,Object> json = new HashMap<>();
        json.put("usuario", usuario);
        json.put("codigo", codigo);
        json.put("mensaje", mensaje);
        json.put("valores", valores);

        return json;
    }
    
}
