package com.example.javalab2oop_web.service;

import com.example.javalab2oop_web.models.Flight;
import com.example.javalab2oop_web.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private Long ID = Long.valueOf(0);
    private List<User> users = new ArrayList<>();
    {
        users.add(new User(++ID, "pilot", "Maxym Hava"));
        users.add(new User(++ID, "pilot", "Alex Gava"));
        users.add(new User(++ID, "pilot", "Endry Kava"));
        users.add(new User(++ID, "stuard", "Nataly Hafw"));
        users.add(new User(++ID, "stuard", "Yulia Shmitz"));
        users.add(new User(++ID, "stuard", "Datya Kabon"));
    }
    public List<User> list(){
        return users;
    }

    public User getUserByName(String name){
        for (User user : users){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    public List<User> getPilotes(){
        List<User> pilotes = new ArrayList<>();
        for (User user : users){
            if(user.getRole().equals("pilot")){
                pilotes.add(user);
            }
        }
        return pilotes;
    }

    public List<User> getStuards(){
        List<User> stuards = new ArrayList<>();
        for (User user : users){
            if(user.getRole().equals("stuard")){
                stuards.add(user);
            }
        }
        return stuards;
    }
}
