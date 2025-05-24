package com.devsuperior.dslist.services;
import java.util.List;
import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.repositories.GameRepository;



// Importando a anotação Service do Spring para marcar a classe como um serviço
@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true) // Indica que o método é somente leitura
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
    
    // Método que retorna todos os jogos do banco de dados
    @Transactional(readOnly = true) // Indica que o método é somente leitura
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
