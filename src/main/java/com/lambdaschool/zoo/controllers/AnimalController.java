package com.lambdaschool.zoo.controllers;

import com.lambdaschool.zoo.services.AnimalService;
import com.lambdaschool.zoo.views.AnimalZooCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    //GET /animals/count - that returns a JSON object list listing the animals and a count of how many zoos where they can be found. Use a custom query for this.
// http://localhost:2019/animals/count
    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> getAnimalZooCount() {
        List<AnimalZooCount> myList = animalService.getAnimalZooCount();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

}
