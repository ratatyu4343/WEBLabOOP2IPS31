package com.example.javalab2oop_web.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Long id;
    private String role;
    private String name;
}
