package com.eventsystem.controllers;

import com.eventsystem.dto.ParticipanteDTO;
import com.eventsystem.services.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipanteService service;

    @GetMapping(value = "/{nome}")
    public ParticipanteDTO findByNome(@PathVariable String nome){
        return service.findByName(nome);
    }
}
