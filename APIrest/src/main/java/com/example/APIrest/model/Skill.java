package com.example.APIrest.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Skill{
    
    private String category;
    private String sub_category;
    private ArrayList<String> names;

    public Skill (String category, String sub_category, ArrayList<String> names ){
        this.category = category;
        this.sub_category = sub_category;
        this.names = new ArrayList<String>();
        this.names.addAll(names);
    }

    public String getCategory(){
        return (this.category);
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getSub_category(){
        return (this.sub_category);
    }

    public void setSub_category (String sub_category){
        this.sub_category = sub_category;
    }

    public ArrayList<String> getNames(){
        return (this.names);
    }

    public void setNames(ArrayList<String> names){
        this.names.addAll(names);
    }

    public void setName(String name){
        this.names.add(name);
    }
}