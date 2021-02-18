package com.lambdaschool.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "zoos")
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    //createdby string
    //createddate timestamp
    //lastmodifiedby string
    //lastmodifieddate timestamp
    //zooname string

    @Column(nullable = false, unique = true)
    private String zooname;

    @OneToMany(mappedBy = "zoos",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoos", allowSetters = true)
    private List<Telephone> telephones = new ArrayList<>();

    @OneToMany(mappedBy = "zoos",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoos", allowSetters = true)
    private Set<ZooAnimals>  animals = new HashSet<>();

    public Zoo() { }

    public Zoo(String zooname) { this.zooname = zooname; }

    public long getZooid() { return zooid; }

    public void setZooid(long zooid) { this.zooid = zooid; }

    public String getZooname() { return zooname; }

    public void setZooname(String zooname) { this.zooname = zooname; }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public Set<ZooAnimals> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<ZooAnimals> animals) {
        this.animals = animals;
    }
}
