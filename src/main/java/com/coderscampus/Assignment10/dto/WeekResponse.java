package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeekResponse {

//    I hate that this empty  shell exists just to hold the weekdays container object (ie Week)
//    Is there a way to yeet this other than doing it manually with the ResponseEntity<String>?
    @JsonProperty("week")
    private Week week;
}
