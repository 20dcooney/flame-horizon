package services;

import models.MatchRoot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MatchService {


RestTemplate restTemplate = new RestTemplate();

private String getMatchURL = "https://americas.api.riotgames.com/lol/match/v5/matches/";
private String apiQuery = "?api_key=";

private String apiKey = "RGAPI-7a7fe972-d5bf-428f-8a83-bf56499e07e1"; //UNTIL REGISTERED MUST BE CHANGED DAILY

    public MatchRoot getMatchByMatchId (String matchId) {

        ResponseEntity response = restTemplate.getForEntity(getMatchURL + matchId + apiQuery + apiKey, MatchRoot.class);

        MatchRoot matchRoot = (MatchRoot) response.getBody();

        return matchRoot;
    }


}
