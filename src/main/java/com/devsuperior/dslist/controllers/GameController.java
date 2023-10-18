package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//configura a classe para ser um controlador
@RequestMapping(value = "/games")//mapeia os recursos/endereço http
                //  |-> configura o caminho que vai ser respondido na minha API
public class GameController {
 // o controller sempre chama o service

    @Autowired//chamando/injetando o service
    private GameService gameService;

    @GetMapping //mapeia com o verbo http GET
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
