package com.flamehorizon.demo.services;


import com.flamehorizon.demo.models.Root;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MatchService {

    public MatchService() {
    }

    RestTemplate restTemplate = new RestTemplate();

    private String getMatchURL = "https://americas.api.riotgames.com/lol/match/v5/matches/";
    private String apiQuery = "?api_key=";

    private String apiKey = "RGAPI-84fffddc-05bc-4fe5-afa5-870ffcc000b9"; //UNTIL REGISTERED MUST BE CHANGED DAILY

    public Root getMatchByMatchId (String matchId) {

        Root response = restTemplate.getForObject(getMatchURL + matchId + apiQuery + apiKey, Root.class);

        return response;
    }

    public Root testingMatch () {
        ResponseEntity response = restTemplate.getForEntity("https://americas.api.riotgames.com/lol/match/v5/matches/NA1_4866431047?api_key=RGAPI-84fffddc-05bc-4fe5-afa5-870ffcc000b9", Root.class);

        return (Root) response.getBody();
    }




}
