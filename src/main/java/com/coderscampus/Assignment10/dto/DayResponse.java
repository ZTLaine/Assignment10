package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DayResponse {
    @JsonProperty("meals")
    private List<Meal> meal;

    @JsonProperty("nutrients")
    private Nutrients nutrients;
}
