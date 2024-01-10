package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Info{
    @JsonProperty("gameCreation")
    public long getGameCreation() { 
		 return this.gameCreation; } 
    public void setGameCreation(long gameCreation) { 
		 this.gameCreation = gameCreation; } 
    long gameCreation;
    @JsonProperty("gameDuration") 
    public int getGameDuration() { 
		 return this.gameDuration; } 
    public void setGameDuration(int gameDuration) { 
		 this.gameDuration = gameDuration; } 
    int gameDuration;
    @JsonProperty("gameEndTimestamp") 
    public long getGameEndTimestamp() { 
		 return this.gameEndTimestamp; } 
    public void setGameEndTimestamp(long gameEndTimestamp) { 
		 this.gameEndTimestamp = gameEndTimestamp; } 
    long gameEndTimestamp;
    @JsonProperty("gameId") 
    public long getGameId() { 
		 return this.gameId; } 
    public void setGameId(long gameId) { 
		 this.gameId = gameId; } 
    long gameId;
    @JsonProperty("gameMode") 
    public String getGameMode() { 
		 return this.gameMode; } 
    public void setGameMode(String gameMode) { 
		 this.gameMode = gameMode; } 
    String gameMode;
    @JsonProperty("gameName") 
    public String getGameName() { 
		 return this.gameName; } 
    public void setGameName(String gameName) { 
		 this.gameName = gameName; } 
    String gameName;
    @JsonProperty("gameStartTimestamp") 
    public long getGameStartTimestamp() { 
		 return this.gameStartTimestamp; } 
    public void setGameStartTimestamp(long gameStartTimestamp) { 
		 this.gameStartTimestamp = gameStartTimestamp; } 
    long gameStartTimestamp;
    @JsonProperty("gameType") 
    public String getGameType() { 
		 return this.gameType; } 
    public void setGameType(String gameType) { 
		 this.gameType = gameType; } 
    String gameType;
    @JsonProperty("gameVersion") 
    public String getGameVersion() { 
		 return this.gameVersion; } 
    public void setGameVersion(String gameVersion) { 
		 this.gameVersion = gameVersion; } 
    String gameVersion;
    @JsonProperty("mapId") 
    public int getMapId() { 
		 return this.mapId; } 
    public void setMapId(int mapId) { 
		 this.mapId = mapId; } 
    int mapId;
    @JsonProperty("participants") 
    public ArrayList<Participant> getParticipants() {
		 return this.participants; } 
    public void setParticipants(ArrayList<Participant> participants) {
		 this.participants = participants; } 
    ArrayList<Participant> participants;
    @JsonProperty("platformId") 
    public String getPlatformId() { 
		 return this.platformId; } 
    public void setPlatformId(String platformId) { 
		 this.platformId = platformId; } 
    String platformId;
    @JsonProperty("queueId") 
    public int getQueueId() { 
		 return this.queueId; } 
    public void setQueueId(int queueId) { 
		 this.queueId = queueId; } 
    int queueId;
    @JsonProperty("teams") 
    public ArrayList<Team> getTeams() {
		 return this.teams; } 
    public void setTeams(ArrayList<Team> teams) {
		 this.teams = teams; } 
    ArrayList<Team> teams;
    @JsonProperty("tournamentCode") 
    public String getTournamentCode() { 
		 return this.tournamentCode; } 
    public void setTournamentCode(String tournamentCode) { 
		 this.tournamentCode = tournamentCode; } 
    String tournamentCode;
}
