package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeekResponse {

    @JsonProperty("week")
    private WeekContainer weekContainer;
}
