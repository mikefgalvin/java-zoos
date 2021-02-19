package com.lambdaschool.zoo.repository;

import com.lambdaschool.zoo.models.Animal;
import com.lambdaschool.zoo.views.AnimalZooCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {


    @Query(value = "SELECT a.animaltype, a.animalid, COUNT(za.zooid) as zoocount " +
            "FROM ANIMALS a " +
            "LEFT JOIN zooanimals za " +
            "ON za.animalid = a.animalid " +
            "GROUP BY a.animaltype " +
            "ORDER BY zoocount DESC",
            nativeQuery = true)
    List<AnimalZooCount> getAnimalZooCount();
}
