package com.devsuperior.dslist.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;

import java.util.List;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping("/lists") // Mapeia a requisição GET para o endpoint /lists
public class GameListController {
    @Autowired
    GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findByALL(){
        List<GameListDTO> result = gameListService.findByALL();
        return result;
    }
    
    @GetMapping(value = "/{listId}/games") // Mapeia a requisição GET para o endpoint /lists/{id}
    public List<GameMinDTO> findByList(@PathVariable long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
}
