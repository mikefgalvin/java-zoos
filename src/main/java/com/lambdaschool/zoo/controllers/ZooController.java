package com.lambdaschool.zoo.controllers;


import com.lambdaschool.zoo.models.Zoo;
import com.lambdaschool.zoo.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    //Autowired
    @Autowired
    private ZooService zooService;


//    GET /zoos/zoos - returns all zoos with their phone numbers and animals
//    http://localhost:2019/zoos/zoos
    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> listAllZoos()
    {
        List<Zoo> myZoos = zooService.findAllZoos();
        return new ResponseEntity<>(myZoos, HttpStatus.OK);
    }

//    GET /zoos/zoo/{id} - returns all information related to a zoo based on its id
//    http://localhost:2019/zoos/zoo/5
    @GetMapping(value = "/zoo/{zooid}", produces = "application/json")
    public ResponseEntity<?> findZooById(@PathVariable Long zooid) {
        Zoo zoo = zooService.findZooById(zooid);
        return new ResponseEntity<>(zoo, HttpStatus.OK);
    }
}
