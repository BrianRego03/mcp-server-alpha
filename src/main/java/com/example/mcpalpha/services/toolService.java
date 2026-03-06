package com.example.mcpalpha.services;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class toolService {
    public record videoGame(String name, int price){

    }
    private final Map<String,videoGame> gameList = new ConcurrentHashMap<>();

    @Tool(name="addGame",
        description = "Add a new game to the game list. Specify it's name and price")
    public String addGame(String name, int price){
        gameList.put(name,new videoGame(name, price));

        return "New Game Added: '" + name + "' at price: " + price;
    }

    @Tool(name = "getGameList",
        description = "Get all games currently in game list")
    public List<videoGame> getGameList(){
        return new ArrayList<>(gameList.values());
    }


}
