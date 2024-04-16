package com.eventsystem.dto;

import com.eventsystem.entities.Atividade;

public class AtividadeDTO {

    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;

    public AtividadeDTO(){}

    public AtividadeDTO(Integer id, String nome, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public AtividadeDTO(Atividade entity){
        id = entity.getId();
        nome = entity.getNome();
        descricao = entity.getDescricao();
        preco = entity.getPreco();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }
}
