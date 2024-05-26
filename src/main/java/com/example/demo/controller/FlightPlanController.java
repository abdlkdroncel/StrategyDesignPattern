package com.example.demo.controller;

import com.example.demo.dt.FlightRequest;
import com.example.demo.factory.FlightFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/flightPlanning")
@RestController
public class FlightPlanController {

    private final FlightFactory factory;

    public FlightPlanController(FlightFactory factory) {
        this.factory = factory;
    }

    @PostMapping
    public ResponseEntity<String> flightPlan(@RequestBody FlightRequest flightRequest){
        String message=factory.makeFlightPlan(flightRequest);
        return ResponseEntity.ok(message);
    }
}
