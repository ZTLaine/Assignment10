//  6/9/24
//  Zack Laine
//  Assignment 10

package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DayResponse {
    @JsonProperty("meals")
    private List<Meal> meals;

    @JsonProperty("nutrients")
    private Nutrients nutrients;
}
