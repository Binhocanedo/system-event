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
    public ParticipanteDTO findById(Long id){
        Optional<Participante> result = repository.findById(id);

        Participante participante = result.get();

        ParticipanteDTO dto = new ParticipanteDTO(participante);

        return dto;
    }

    @Transactional
    public ParticipanteDTO insert(ParticipanteDTO dto){
        Participante entity = new Participante();

        entity.setNome(dto.getNome());
        entity.setEmail(dto.getEmail());

        entity = repository.save(entity);


        return new ParticipanteDTO(entity);
    }

    @Transactional
    public ParticipanteDTO update(Long id, ParticipanteDTO dto){

        Participante entity = repository.getReferenceById(id);

        copyDtoToEntity(dto, entity);

        entity = repository.save(entity);

        return new ParticipanteDTO(entity);

    }
    @Transactional
    public void delete(Long id){
        repository.deleteById(id);
    }

    private void copyDtoToEntity(ParticipanteDTO dto, Participante entity) {
        entity.setNome(dto.getNome());
        entity.setEmail(dto.getEmail());
    }
}
