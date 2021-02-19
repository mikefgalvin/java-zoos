package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Zoo;

import java.util.List;

public interface ZooService {

    List<Zoo> findAllZoos();
    Zoo findZooById(long id);
    Zoo save(Zoo zoo);
}
