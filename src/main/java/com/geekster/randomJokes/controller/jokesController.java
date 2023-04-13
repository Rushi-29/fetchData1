package com.geekster.randomJokes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class jokesController {
    static ArrayList<String> jokesList=new ArrayList<>();
    @PostMapping(value = "/jokes")
    public String saveJokes(@RequestBody String jokes){
        jokesList.add(jokes);
        return "joke saved";
    }
    @GetMapping(value="/jokes")
    public String getJokes(){

        jokesList.add("What animal loves a baseball game?\n" +
                "A bat.");
        jokesList.add("What did the Dalmatian say after finishing her breakfast?\n" +
                "That hit the spot.");
        jokesList.add("What is black and white and red all over?\n" +
                "An embarrassed zebra.");
        jokesList.add("Why didn't the frog park his car on the street?\n" +
                "He didn't want to get toad.");

        int randomNumber = 0 + (int) (Math.random() * ( ((jokesList.size() - 1) - 0) + 1));

        return jokesList.get(randomNumber);
    }
}
