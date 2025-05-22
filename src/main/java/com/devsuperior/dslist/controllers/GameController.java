package com.devsuperior.dslist.controllers;
import com.devsuperior.dslist.services.GameService;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.dto.GameMinDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired // Instancia o GameService automaticamente
    private GameService gameService;

    @GetMapping // Mapeia a requisição GET para o endpoint /games
    public List<GameMinDTO> findALL(){
        List<GameMinDTO> result = gameService.findAll();
        return result; 
    }
}
