package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Zoo;
import com.lambdaschool.zoo.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService {

    @Autowired
    ZooRepository zoorepos;

    public Zoo save(Zoo zoo) {
        return zoorepos.save(zoo);
    }
}
