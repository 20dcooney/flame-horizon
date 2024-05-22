package com.flamehorizon.demo.services;


import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.flamehorizon.demo.match_model.MatchRoot;
import com.flamehorizon.demo.models.Root;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class MatchService {

    public MatchService() {
    }

    RestTemplate restTemplate = new RestTemplate();

    private String listMatchesByPuuidURL = "https://americas.api.riotgames.com/lol/match/v5/matches/by-puuid/";

    private String listMatchesPartTwoURL = "/ids?start=0&count=20&api_key=";

    private String getMatchURL = "https://americas.api.riotgames.com/lol/match/v5/matches/";
    private String apiQuery = "?api_key=";

    private String apiKey = "RGAPI-4757fcda-00d6-4fb0-ae6b-f25ee1afa33e"; //UNTIL REGISTERED MUST BE CHANGED DAILY

    
    public Root getMatchByMatchId (String matchId) {

        Root response = restTemplate.getForObject(getMatchURL + matchId + apiQuery + apiKey, Root.class);

        return response;
    }

    public MatchRoot getMatchesByPuuid (String puuid) {

        ResponseEntity response = restTemplate.getForEntity( listMatchesByPuuidURL + puuid + listMatchesPartTwoURL + apiKey, MatchRoot.class);

        return (MatchRoot) response.getBody();
    }





}
