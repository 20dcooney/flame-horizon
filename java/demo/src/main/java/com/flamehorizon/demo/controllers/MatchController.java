package com.flamehorizon.demo.controllers;

import com.flamehorizon.demo.match_model.MatchRoot;
import com.flamehorizon.demo.models.Root;
import com.flamehorizon.demo.services.MatchService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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

    @RequestMapping(path="/user/{puuid}", method = RequestMethod.GET)
    public MatchRoot getMatchesByPuuid(@PathVariable String puuid) {

        return matchService.getMatchesByPuuid(puuid);
    }








}
