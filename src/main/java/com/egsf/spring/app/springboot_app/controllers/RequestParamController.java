package com.egsf.spring.app.springboot_app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egsf.spring.app.springboot_app.models.dto.ParametroDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/parametros")
public class RequestParamController {
    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam(required = false) String info) {
        ParametroDTO parametrodto = new ParametroDTO();
        parametrodto.setInformacion(info);

        return parametrodto;
    }
    
    
}
