package com.flamehorizon.demo.services;

import com.flamehorizon.demo.models.Player;
import com.flamehorizon.demo.models.PlayerRoot;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PlayerService {

    public String API_KEY = "?api_key=RGAPI-849a1873-4001-45d2-ac7a-ef0e40857da8";
    public String playerByRiotIdString = "https://americas.api.riotgames.com/riot/account/v1/accounts/by-riot-id/";
    RestTemplate restTemplate = new RestTemplate();

    //The playerInfo parameter will not have a puuid, it will be null
    //This method will retrieve the puuid and return a completed object
    public PlayerRoot getPlayerByRiotId (PlayerRoot playerInfo) {

        PlayerRoot returnRoot = restTemplate.getForObject( playerByRiotIdString + playerInfo.getGameName() + "/" + playerInfo.getTagLine() + API_KEY, PlayerRoot.class);

        return returnRoot;
    }




}
