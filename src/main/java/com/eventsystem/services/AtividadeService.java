package com.eventsystem.services;

import com.eventsystem.dto.AtividadeDTO;
import com.eventsystem.entities.Atividade;
import com.eventsystem.repositories.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository repository;

    @Transactional(readOnly = true)
    public AtividadeDTO findById(Integer id){
        //Puxar os dados pela JPA com a classe Repository e filtrar por ID
        Optional<Atividade> result = repository.findById(id);

        //Instanciar um objeto da Entitade e pegar os valores
        Atividade atividade = result.get();

        //E atribuir o resultado da JPA para a DTO e retornar um DTO
        AtividadeDTO dto = new AtividadeDTO(atividade);

        //Retornar um objeto DTO para o Controller
        return dto;
    }
}
