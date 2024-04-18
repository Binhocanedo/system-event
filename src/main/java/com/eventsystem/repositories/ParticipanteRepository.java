package com.eventsystem.repositories;

import com.eventsystem.entities.Participante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParticipanteRepository extends JpaRepository<Participante, Long>{}
