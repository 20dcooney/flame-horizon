package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Selection{
    @JsonProperty("perk")
    public int getPerk() { 
		 return this.perk; } 
    public void setPerk(int perk) { 
		 this.perk = perk; } 
    int perk;
    @JsonProperty("var1") 
    public int getVar1() { 
		 return this.var1; } 
    public void setVar1(int var1) { 
		 this.var1 = var1; } 
    int var1;
    @JsonProperty("var2") 
    public int getVar2() { 
		 return this.var2; } 
    public void setVar2(int var2) { 
		 this.var2 = var2; } 
    int var2;
    @JsonProperty("var3") 
    public int getVar3() { 
		 return this.var3; } 
    public void setVar3(int var3) { 
		 this.var3 = var3; } 
    int var3;
}
