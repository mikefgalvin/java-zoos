package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Animal;
import com.lambdaschool.zoo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    AnimalRepository animalrepos;

    public Animal save(Animal animal) {
        return animalrepos.save(animal);
    }
}
