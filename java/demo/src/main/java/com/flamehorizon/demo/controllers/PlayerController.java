package com.flamehorizon.demo.controllers;

import com.flamehorizon.demo.models.PlayerRoot;
import com.flamehorizon.demo.services.PlayerService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/player")
public class PlayerController {

    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping(path="/riotid", method = RequestMethod.POST)
    public PlayerRoot getPlayerByRiotId(@RequestBody PlayerRoot inputPlayer) {
        return  playerService.getPlayerByRiotId(inputPlayer);
    }
}
