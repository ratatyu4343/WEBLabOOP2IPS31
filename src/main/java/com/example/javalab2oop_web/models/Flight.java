package com.example.javalab2oop_web.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Flight {
    private Long id;
    private User pilot;
    private User shturman;
    private User stuard1;
    private User stuard2;
    private String from;
    private String to;
    private String date;
}
