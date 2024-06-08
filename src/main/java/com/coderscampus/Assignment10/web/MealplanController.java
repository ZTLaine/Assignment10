package com.coderscampus.Assignment10.web;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import com.coderscampus.Assignment10.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class MealplanController {

    @Autowired
    ApiService apiService;


    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam(required = false) String numCalories,
                                                     @RequestParam(required = false) String diet,
                                                     @RequestParam(required = false) String exclusions){

        return apiService.callWeekApi(numCalories, diet, exclusions);
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(@RequestParam(required = false) String numCalories,
                                                   @RequestParam(required = false) String diet,
                                                   @RequestParam(required = false) String exclusions){

        return apiService.callDayApi(numCalories, diet, exclusions);
    }
}
