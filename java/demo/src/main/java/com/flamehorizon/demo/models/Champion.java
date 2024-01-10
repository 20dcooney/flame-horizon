package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Champion{
    @JsonProperty("first")
    public boolean getFirst() { 
		 return this.first; } 
    public void setFirst(boolean first) { 
		 this.first = first; } 
    boolean first;
    @JsonProperty("kills") 
    public int getKills() { 
		 return this.kills; } 
    public void setKills(int kills) { 
		 this.kills = kills; } 
    int kills;
}
