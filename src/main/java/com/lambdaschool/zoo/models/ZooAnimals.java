package com.lambdaschool.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "zooanimals")
public class ZooAnimals {

        @Id
        @ManyToOne
        @JoinColumn(name = "zooid")
        @JsonIgnoreProperties(value = "zooanimals", allowSetters = true)
        private Zoo zoo;

        @Id
        @ManyToOne
        @JoinColumn(name = "animalid")
        @JsonIgnoreProperties(value = "zooanimals", allowSetters = true)
        private Animal animal;

        private String incomingzoo;

    public ZooAnimals() {
    }

    public ZooAnimals(Zoo zoo, Animal animal, String incomingzoo) {
        this.zoo = zoo;
        this.animal = animal;
        this.incomingzoo = incomingzoo;
    }

    public Zoo getZoo() { return zoo; }

    public void setZoo(Zoo zoo) { this.zoo = zoo; }

    public Animal getAnimal() { return animal; }

    public void setAnimal(Animal animal) { this.animal = animal; }

    public String getIncomingzoo() { return incomingzoo; }

    public void setIncomingzoo(String incomingzoo) { this.incomingzoo = incomingzoo; }

    // createdby
    // createdate
    // lastmodifiedby
    // lastmodifieddate
    // incomingzoo

}
