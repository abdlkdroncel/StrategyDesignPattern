package com.example.demo.factory;

import com.example.demo.dt.FlightRequest;

public interface FlightFactory {

    String makeFlightPlan(FlightRequest flightRequest);
}
