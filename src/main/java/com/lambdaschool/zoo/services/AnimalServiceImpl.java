package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Animal;
import com.lambdaschool.zoo.repository.AnimalRepository;
import com.lambdaschool.zoo.views.AnimalZooCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    AnimalRepository animalrepos;

    @Override
    public List<AnimalZooCount> getAnimalZooCount() {
        List<AnimalZooCount> list = animalrepos.getAnimalZooCount();
        return list;
    }

    public Animal save(Animal animal) {
        return animalrepos.save(animal);
    }
}
