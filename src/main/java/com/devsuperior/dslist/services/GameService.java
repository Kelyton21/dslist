package com.devsuperior.dslist.services;
import java.util.List;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.repositories.GameRepository;

// Importando a anotação Service do Spring para marcar a classe como um serviço
@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    // O repositório é injetado automaticamente pelo Spring, permitindo o acesso ao banco de dados

    // Método que retorna todos os jogos do banco de dados
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
