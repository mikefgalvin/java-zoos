package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Animal;
import com.lambdaschool.zoo.views.AnimalZooCount;

import java.util.List;

public interface AnimalService {

    List<AnimalZooCount> getAnimalZooCount();

    Animal save(Animal animal);
}
