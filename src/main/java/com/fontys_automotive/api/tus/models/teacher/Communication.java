package com.fontys_automotive.api.tus.models.teacher;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Communication{
    public Address address;

    public Communication(Address address, String email, ArrayList<Web> web) {
        this.address = address;
        this.email = email;
        this.web = web;
    }

    public String email;
    public ArrayList<Web> web;
}
