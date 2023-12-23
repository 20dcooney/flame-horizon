package services;

import models.MatchRoot;
import org.springframework.web.client.RestTemplate;

public class MatchService {


RestTemplate restTemplate = new RestTemplate();

private String getMatchURL = "https://americas.api.riotgames.com/lol/match/v5/matches/";
private String apiQuery = "?api_key=";

    public MatchRoot getMatchByMatchId (String matchId) {

        return null;
    }


}
