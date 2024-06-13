//  6/9/24
//  Zack Laine
//  Assignment 10

package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Week {
    @JsonProperty("monday")
    private DayResponse monday;

    @JsonProperty("tuesday")
    private DayResponse tuesday;

    @JsonProperty("wednesday")
    private DayResponse wednesday;

    @JsonProperty("thursday")
    private DayResponse thursday;

    @JsonProperty("friday")
    private DayResponse friday;

    @JsonProperty("saturday")
    private DayResponse saturday;

    @JsonProperty("sunday")
    private DayResponse sunday;
}
