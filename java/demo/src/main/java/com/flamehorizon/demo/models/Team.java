package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Team{
    @JsonProperty("bans")
    public ArrayList<Object> getBans() {
		 return this.bans; } 
    public void setBans(ArrayList<Object> bans) { 
		 this.bans = bans; } 
    ArrayList<Object> bans;
    @JsonProperty("objectives") 
    public Objectives getObjectives() {
		 return this.objectives; } 
    public void setObjectives(Objectives objectives) {
		 this.objectives = objectives; } 
    Objectives objectives;
    @JsonProperty("teamId") 
    public int getTeamId() { 
		 return this.teamId; } 
    public void setTeamId(int teamId) { 
		 this.teamId = teamId; } 
    int teamId;
    @JsonProperty("win") 
    public boolean getWin() { 
		 return this.win; } 
    public void setWin(boolean win) { 
		 this.win = win; } 
    boolean win;
}
