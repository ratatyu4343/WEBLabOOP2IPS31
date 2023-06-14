package com.example.javalab2oop_web.controllers;

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

    @GetMapping(path = "/flights")
    public String flightsGet(Model model){
        model.addAttribute("flights", flightService.list());
        return "flightsList";
    }

    @GetMapping(path = "/flights/delete/{id}")
    public String deleteFlight(@PathVariable Long id){
        flightService.deleteFlight(id);
        return "redirect:/flights";
    }
}
