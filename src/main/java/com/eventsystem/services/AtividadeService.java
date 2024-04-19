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

    @Transactional
    public AtividadeDTO insert(AtividadeDTO dto){
        Atividade entity = new Atividade();

        copyDtoToEntity(entity, dto);

        entity = repository.save(entity);

        return new AtividadeDTO(entity);
    }

    @Transactional
    public AtividadeDTO update(Integer id, AtividadeDTO dto){
        Atividade entity = repository.getReferenceById(id);
        copyDtoToEntity(entity, dto);
        entity = repository.save(entity);
        return new AtividadeDTO(entity);
    }

    @Transactional
    public void delete(Integer id){
        repository.deleteById(id);
    }

    public void copyDtoToEntity(Atividade entity, AtividadeDTO dto){
        entity.setNome(dto.getNome());
        entity.setDescricao(dto.getDescricao());
        entity.setPreco(dto.getPreco());
    }
}
