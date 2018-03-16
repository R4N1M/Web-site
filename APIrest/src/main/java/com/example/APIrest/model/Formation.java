package com.example.APIrest.model;

public class Formation implements General{
    
    private String duration;
    private String description;

    public Formation (String duration, String description){
        this.duration = duration;
        this.description = description;
    }

    public String getDuration(){
        return (this.duration);
    }

    public void setDuration (String duration){
        this.duration = duration;
    }

    public String getDesciption(){
        return (this.description);
    }

    public void setDescription(String description){
        this.description = description;
    }
}