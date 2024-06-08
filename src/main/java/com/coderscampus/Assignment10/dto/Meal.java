package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Meal {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("imageType")
    private String imageType;

    @JsonProperty("title")
    private String title;

    @JsonProperty("readyInMinutes")
    private Integer readyInMinutes;

    @JsonProperty("servings")
    private Integer servings;

    @JsonProperty("sourceUrl")
    private String sourceUrl;
}
