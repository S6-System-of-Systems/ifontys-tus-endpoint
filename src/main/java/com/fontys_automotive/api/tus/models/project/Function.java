package com.fontys_automotive.api.tus.models.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Function{
    public String title;
    @JsonProperty("level_modifier")
    public String levelModifier;
    public List<Classification> classifications;

    public Function(String title, String levelModifier, ArrayList<Classification> classifications) {
        this.title = title;
        this.levelModifier = levelModifier;
        this.classifications = classifications;
    }
}
