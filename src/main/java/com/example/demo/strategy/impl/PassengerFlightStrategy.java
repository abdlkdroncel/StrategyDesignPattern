package com.example.demo.strategy.impl;

import com.example.demo.strategy.FlightStrategy;
import org.springframework.stereotype.Service;

@Service("passenger ")
public class PassengerFlightStrategy implements FlightStrategy {
    @Override
    public String flight(String name, String flightType, String pnr) {
        return "Passenger Flight is Planning";
    }
}
