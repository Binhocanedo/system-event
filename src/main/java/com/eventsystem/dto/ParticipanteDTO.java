package com.eventsystem.dto;


import com.eventsystem.entities.Participante;

public class ParticipanteDTO {

    private Integer id;
    private String nome;
    private String email;

    public ParticipanteDTO(){}

    public ParticipanteDTO(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public ParticipanteDTO(Participante participante){
        id = participante.getId();
        nome = participante.getNome();
        email = participante.getEmail();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
