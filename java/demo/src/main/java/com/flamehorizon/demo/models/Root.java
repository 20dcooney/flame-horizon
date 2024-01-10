package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    @JsonProperty("metadata")
    public Metadata getMetadata() {
		 return this.metadata; } 
    public void setMetadata(Metadata metadata) {
		 this.metadata = metadata; } 
    Metadata metadata;
    @JsonProperty("info") 
    public Info getInfo() {
		 return this.info; } 
    public void setInfo(Info info) {
		 this.info = info; } 
    Info info;
}
