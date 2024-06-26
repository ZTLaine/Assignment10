//  6/9/24
//  Zack Laine
//  Assignment 10

package com.coderscampus.Assignment10.web;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import com.coderscampus.Assignment10.service.ApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealplanController {
    private final ApiService apiService;

//    I switched to this to get rid of the warning @Autowired creates...
//    Is it generally preferable to avoid @Autowiring?
//    Claude suggested it was, even with @PostConstruct brought into the mix
    public MealplanController(ApiService apiService){
        this.apiService = apiService;
    }

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
