package com.example.javalab2oop_web.controllers;

import com.example.javalab2oop_web.models.Flight;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.javalab2oop_web.service.FlightService;

@Controller
@RequiredArgsConstructor
public class FlightController {
    private final FlightService flightService;

    @GetMapping(path = "/")
    public String mainPage(Model model){
        return "main.html";
    }

    @GetMapping(path = "/admin")
    public String adminPage(Model model){
        return "administrator";
    }

    @GetMapping(path = "/disp")
    public String dispPage(){
        return "dispetcher";
    }

    @GetMapping(path = "/flights")
    public String flightsGet(Model model){
        model.addAttribute("flights", flightService.list());
        return "flightsList";
    }

    @GetMapping(path = "/flights/delete/{id}")
    public String deleteFlight(@PathVariable Long id){
        flightService.deleteFlight(id);
        return "redirect:/admin";
    }

    @GetMapping(path = "/flights/addNew")
    public String addFlightForm(){
        return "newFly";
    }
    @PostMapping(path = "/flights/addNew")
    public String addFlight(Flight flight){
        flightService.saveFlight(flight);
        return "redirect:/disp";
    }
}
