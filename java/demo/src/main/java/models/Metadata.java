package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Metadata{
    @JsonProperty("dataVersion")
    public String getDataVersion() { 
		 return this.dataVersion; } 
    public void setDataVersion(String dataVersion) { 
		 this.dataVersion = dataVersion; } 
    String dataVersion;
    @JsonProperty("matchId") 
    public String getMatchId() { 
		 return this.matchId; } 
    public void setMatchId(String matchId) { 
		 this.matchId = matchId; } 
    String matchId;
    @JsonProperty("participants") 
    public ArrayList<String> getParticipants() {
		 return this.participants; } 
    public void setParticipants(ArrayList<String> participants) { 
		 this.participants = participants; } 
    ArrayList<String> participants;
}
