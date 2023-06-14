package com.example.javalab2oop_web.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Flight {
    private Long id = Long.valueOf(0);
    private String pilot;
    private String shturman;
    private String stuard1;
    private String stuard2;
    private String from;
    private String to;
    private String date;
}
