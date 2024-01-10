package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Objectives{
    @JsonProperty("baron")
    public Baron getBaron() {
		 return this.baron; } 
    public void setBaron(Baron baron) { 
		 this.baron = baron; } 
    Baron baron;
    @JsonProperty("champion") 
    public Champion getChampion() {
		 return this.champion; } 
    public void setChampion(Champion champion) { 
		 this.champion = champion; } 
    Champion champion;
    @JsonProperty("dragon") 
    public Dragon getDragon() {
		 return this.dragon; } 
    public void setDragon(Dragon dragon) { 
		 this.dragon = dragon; } 
    Dragon dragon;
    @JsonProperty("horde") 
    public Horde getHorde() {
		 return this.horde; } 
    public void setHorde(Horde horde) { 
		 this.horde = horde; } 
    Horde horde;
    @JsonProperty("inhibitor") 
    public Inhibitor getInhibitor() {
		 return this.inhibitor; } 
    public void setInhibitor(Inhibitor inhibitor) { 
		 this.inhibitor = inhibitor; } 
    Inhibitor inhibitor;
    @JsonProperty("riftHerald") 
    public RiftHerald getRiftHerald() { 
		 return this.riftHerald; } 
    public void setRiftHerald(RiftHerald riftHerald) { 
		 this.riftHerald = riftHerald; } 
    RiftHerald riftHerald;
    @JsonProperty("tower") 
    public Tower getTower() { 
		 return this.tower; } 
    public void setTower(Tower tower) { 
		 this.tower = tower; } 
    Tower tower;
}
