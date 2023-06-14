package com.example.javalab2oop_web.service;

import com.example.javalab2oop_web.models.Flight;
import com.example.javalab2oop_web.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {
    private Long ID = Long.valueOf(0);
    private List<Flight> flights = new ArrayList<>();
    {
        UserService userService = new UserService();
        List<User> pilotes = userService.getPilotes();
        List<User> stuards = userService.getStuards();
        flights.add(new Flight(++ID, pilotes.get(0).getName(), pilotes.get(2).getName(), stuards.get(0).getName(), stuards.get(1).getName(), "Kyiv", "Paris", "14.06.2023"));
        flights.add(new Flight(++ID, pilotes.get(1).getName(), pilotes.get(0).getName(), stuards.get(2).getName(), stuards.get(0).getName(), "Paris", "London", "15.06.2023"));
        flights.add(new Flight(++ID, pilotes.get(2).getName(), pilotes.get(1).getName(), stuards.get(1).getName(), stuards.get(2).getName(), "London", "Kyiv", "16.06.2023"));
    }

    public List<Flight> list(){
        return flights;
    }

    public void saveFlight(Flight flight){
        flight.setId(++ID);
        flights.add(flight);
    }

    public void deleteFlight(Long id){
        flights.removeIf(flight -> flight.getId().equals(id));
    }
}
