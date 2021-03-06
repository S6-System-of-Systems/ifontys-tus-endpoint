package com.fontys_automotive.api.tus.models.teacher;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Person{
    public Name name;
    public Communication communication;
    public String gender;

    public Person(Name name, Communication communication, String gender, ArrayList<String> photos) {
        this.name = name;
        this.communication = communication;
        this.gender = gender;
        this.photos = photos;
    }

    public ArrayList<String> photos;
}