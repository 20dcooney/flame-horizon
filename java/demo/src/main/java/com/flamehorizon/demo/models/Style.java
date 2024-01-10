package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Style{
    @JsonProperty("description")
    public String getDescription() { 
		 return this.description; } 
    public void setDescription(String description) { 
		 this.description = description; } 
    String description;
    @JsonProperty("selections") 
    public ArrayList<Selection> getSelections() {
		 return this.selections; } 
    public void setSelections(ArrayList<Selection> selections) {
		 this.selections = selections; } 
    ArrayList<Selection> selections;
    @JsonProperty("style") 
    public int getStyle() { 
		 return this.style; } 
    public void setStyle(int style) { 
		 this.style = style; } 
    int style;
}
