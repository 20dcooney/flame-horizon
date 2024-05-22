package com.flamehorizon.demo.match_model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class MatchRoot {

    public ArrayList<String> matchNumberArray;

    public ArrayList<String> getMyArray() {
        return this.matchNumberArray;
    }
    public void setMyArray(ArrayList<String> matchNumberArray) {
        this.matchNumberArray = matchNumberArray;
    }
}
