package com.coderscampus.Assignment10.service;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class ApiService {

    public ResponseEntity<WeekResponse> callWeekApi(String numCalories, String diet, String exclusions){
        RestTemplate restTemplate = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "week")
//                .queryParam("targetCalories", numCalories)
//                .queryParam("diet", diet)
//                .queryParam("exclude", exclusions)
                .queryParam("apiKey", "bc0ee5eb33774babac8bd11667ddb8d8")
                .build()
                .toUri();
        ResponseEntity<String> stringResponse = restTemplate.getForEntity(uri, String.class);
        ResponseEntity<WeekResponse> response = restTemplate.getForEntity(uri, WeekResponse.class);
        System.out.println(response.getBody());
        return response;
    }
    public ResponseEntity<DayResponse> callDayApi(String numCalories, String diet, String exclusions){
        RestTemplate restTemplate = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "day")
//                .queryParam("targetCalories", numCalories)
//                .queryParam("diet", diet)
//                .queryParam("exclude", exclusions)
                .queryParam("apiKey", "bc0ee5eb33774babac8bd11667ddb8d8")
                .build()
                .toUri();
        ResponseEntity<String> stringResponse = restTemplate.getForEntity(uri, String.class);
        ResponseEntity<DayResponse> response = restTemplate.getForEntity(uri, DayResponse.class);
        System.out.println(response.getBody());
        return response;
    }


}
