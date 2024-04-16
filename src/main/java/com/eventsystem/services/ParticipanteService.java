package com.eventsystem.services;


import com.eventsystem.dto.ParticipanteDTO;
import com.eventsystem.entities.Atividade;
import com.eventsystem.entities.Participante;
import com.eventsystem.repositories.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ParticipanteService {

    @Autowired
    private ParticipanteRepository repository;

    @Transactional(readOnly = true)
    public ParticipanteDTO findByName(String nome){
        Optional<Participante> result = repository.findByNome(nome);

        Participante participante = result.get();

        ParticipanteDTO dto = new ParticipanteDTO(participante);

        return dto;
    }


}
