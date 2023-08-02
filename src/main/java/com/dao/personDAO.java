package com.dao;

import com.model.Person;

import java.util.UUID;

public interface personDAO {
    int insertPerson(UUID id, Person person);

    default int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
