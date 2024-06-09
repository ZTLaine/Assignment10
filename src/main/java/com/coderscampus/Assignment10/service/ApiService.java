//  6/9/24
//  Zack Laine
//  Assignment 10

package com.coderscampus.Assignment10.service;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
public class ApiService {

    @Value("${spoonacular.urls.base}")
    private String spoonacularBase;

    @Value("${spoonacular.urls.mealplan}")
    private String spoonacularGenerate;

    public ResponseEntity<WeekResponse> callWeekApi(String numCalories, String diet, String exclusions){
        RestTemplate restTemplate = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl(spoonacularBase + spoonacularGenerate)
                .queryParam("timeFrame", "week")
                .queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
                .queryParamIfPresent("diet", Optional.ofNullable(diet))
                .queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
                .queryParam("apiKey", "bc0ee5eb33774babac8bd11667ddb8d8")
                .build()
                .toUri();
        return restTemplate.getForEntity(uri, WeekResponse.class);
    }
    public ResponseEntity<DayResponse> callDayApi(String numCalories, String diet, String exclusions){
        RestTemplate restTemplate = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl(spoonacularBase + spoonacularGenerate)
                .queryParam("timeFrame", "day")
                .queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
                .queryParamIfPresent("diet", Optional.ofNullable(diet))
                .queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
                .queryParam("apiKey", "bc0ee5eb33774babac8bd11667ddb8d8")
                .build()
                .toUri();
        return restTemplate.getForEntity(uri, DayResponse.class);
    }


}
