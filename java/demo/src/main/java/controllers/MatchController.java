package controllers;

import models.MatchRoot;
import org.springframework.web.bind.annotation.*;
import services.MatchService;

@CrossOrigin
@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @RequestMapping(path = "/{matchId}", method = RequestMethod.GET)
    public MatchRoot getMatchById(@PathVariable String matchId) {
        return matchService.getMatchByMatchId(matchId);
    }



}
