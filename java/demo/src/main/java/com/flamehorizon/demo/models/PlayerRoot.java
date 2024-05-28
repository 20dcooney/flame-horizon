package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerRoot{
    @JsonProperty("puuid")
    public String getPuuid() {
        return this.puuid; }
    public void setPuuid(String puuid) {
        this.puuid = puuid; }
    String puuid;
    @JsonProperty("gameName")
    public String getGameName() {
        return this.gameName; }
    public void setGameName(String gameName) {
        this.gameName = gameName; }
    String gameName;
    @JsonProperty("tagLine")
    public String getTagLine() {
        return this.tagLine; }
    public void setTagLine(String tagLine) {
        this.tagLine = tagLine; }
    String tagLine;
}
