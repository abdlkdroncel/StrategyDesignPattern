package com.example.demo.factory.impl;

import com.example.demo.dt.FlightRequest;
import com.example.demo.factory.FlightFactory;
import com.example.demo.strategy.FlightStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class FlightFactoryImpl implements FlightFactory {

    private final Map<String, FlightStrategy> strategyMap;

    public FlightFactoryImpl(Map<String, FlightStrategy> strategyMap) {
        this.strategyMap = strategyMap;
    }

    public FlightStrategy getFlightStrategy(String type){
        FlightStrategy flightStrategy = strategyMap.get(type);
        if (flightStrategy==null) {
            throw new IllegalArgumentException("Flight Strategy not found");
        }
        return flightStrategy;
    }

    @Override
    public String makeFlightPlan(FlightRequest flightRequest) {
        FlightStrategy flightStrategy = getFlightStrategy(flightRequest.flightType());
        return flightStrategy.flight(flightRequest.name(),flightRequest.flightType(),flightRequest.pnr());
    }
}
