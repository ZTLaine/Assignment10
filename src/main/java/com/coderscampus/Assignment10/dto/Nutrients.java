package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Nutrients {
    @JsonProperty("calories")
    private Integer calories;

    @JsonProperty("protein")
    private Integer protein;

    @JsonProperty("fat")
    private Integer fat;

    @JsonProperty("carbohydrates")
    private Integer carbohydrates;
}
