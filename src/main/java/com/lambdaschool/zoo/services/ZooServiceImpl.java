package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Zoo;
import com.lambdaschool.zoo.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService {

    @Autowired
    ZooRepository zoorepos;

    @Override
    public List<Zoo> findAllZoos()
    {
        List<Zoo> myList = new ArrayList<>();
        zoorepos.findAll().iterator().forEachRemaining(myList::add);
        return myList;
    }

    @Override
    public Zoo findZooById(long id) {
        Zoo zoo = zoorepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Zoo " + id + " Not Found"));
        return zoo;
    }

    public Zoo save(Zoo zoo) {
        return zoorepos.save(zoo);
    }
}
