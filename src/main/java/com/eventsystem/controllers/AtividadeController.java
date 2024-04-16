package com.eventsystem.controllers;

import com.eventsystem.dto.AtividadeDTO;
import com.eventsystem.services.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeService service;

    @GetMapping(value = "/{id}")
    public AtividadeDTO findById(@PathVariable Integer id){
        return service.findById(id);
    }
}
