package com.devsuperior.dslist.controllers;
import com.devsuperior.dslist.services.GameService;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dto.GameDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController // Anotação que indica que esta classe é um controlador REST
// Irá tratar requisições HTTP e retornar respostas no formato JSON
@RequestMapping("/games")
public class GameController {
    @Autowired // Instancia o GameService automaticamente
    private GameService gameService;

    @GetMapping(value = "/{id}") // Mapeia a requisição GET para o endpoint /games/{id}
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping // Mapeia a requisição GET para o endpoint /games
    public List<GameMinDTO> findALL(){
        List<GameMinDTO> result = gameService.findAll();
        return result; 
    }
}
