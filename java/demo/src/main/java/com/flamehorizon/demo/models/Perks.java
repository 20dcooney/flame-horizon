package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Perks{
    @JsonProperty("statPerks")
    public StatPerks getStatPerks() {
		 return this.statPerks; } 
    public void setStatPerks(StatPerks statPerks) {
		 this.statPerks = statPerks; } 
    StatPerks statPerks;
    @JsonProperty("styles") 
    public ArrayList<Style> getStyles() {
		 return this.styles; } 
    public void setStyles(ArrayList<Style> styles) {
		 this.styles = styles; } 
    ArrayList<Style> styles;
}
