package com.flamehorizon.demo.controllers;

import com.flamehorizon.demo.models.Root;
import com.flamehorizon.demo.services.MatchService;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @RequestMapping(path = "/{matchId}", method = RequestMethod.GET)
    public Root getMatchById(@PathVariable String matchId) {

        return matchService.getMatchByMatchId(matchId);
    }

    @RequestMapping(path ="/test", method = RequestMethod.GET)
    public Root testing() {
        return matchService.testingMatch();
    }







}
