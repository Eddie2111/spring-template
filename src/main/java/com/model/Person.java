package com.model;
// 17:41 → https://www.youtube.com/watch?v=vtPkZShrvXQ
import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;

    public Person(UUID id, String name){
        this.id = id;
        this.name = name;
    };
    public UUID getID(){
        return id;
    };
    public String getName(){
        return name;
    }
}
