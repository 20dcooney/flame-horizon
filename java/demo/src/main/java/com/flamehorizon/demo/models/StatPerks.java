package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatPerks{
    @JsonProperty("defense")
    public int getDefense() { 
		 return this.defense; } 
    public void setDefense(int defense) { 
		 this.defense = defense; } 
    int defense;
    @JsonProperty("flex") 
    public int getFlex() { 
		 return this.flex; } 
    public void setFlex(int flex) { 
		 this.flex = flex; } 
    int flex;
    @JsonProperty("offense") 
    public int getOffense() { 
		 return this.offense; } 
    public void setOffense(int offense) { 
		 this.offense = offense; } 
    int offense;
}
