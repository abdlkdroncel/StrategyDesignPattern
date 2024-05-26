package com.example.demo.strategy.impl;

import com.example.demo.strategy.FlightStrategy;
import org.springframework.stereotype.Service;

@Service("cargo")
public class CargoFlightPlanStrategy implements FlightStrategy {
    @Override
    public String flight(String name, String flightType, String pnr) {
        return "Cargo Flight is Planning";
    }
}
