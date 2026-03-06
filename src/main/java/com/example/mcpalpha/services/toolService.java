package com.example.mcpalpha.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class toolService {
    public record videoGame(String name, int price){

    }
    private final Map<String,videoGame> map = new ConcurrentHashMap<>();

    


}
