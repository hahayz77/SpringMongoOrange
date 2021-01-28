package com.first.example.mongoproject.ganbler.controller;

import com.first.example.mongoproject.ganbler.repository.GanblerRepository;
import com.first.example.mongoproject.ganbler.model.Ganbler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/ganbler")
public class GanblerController {

    @Autowired
    public GanblerRepository ganblerRepository;

    public GanblerController(GanblerRepository ganblerRepository) {
        this.ganblerRepository = ganblerRepository;
    }

    @GetMapping("/all")
    public List<Ganbler> getGanbler(){
       List<Ganbler> ganbler = ganblerRepository.findAll();
        return ganbler;
    }

    @GetMapping("/{id}")
    public Optional<Ganbler> getGanblerByID(@PathVariable("id") String id){
        Optional<Ganbler> ganblerId = ganblerRepository.findById(id);
        return ganblerId;
    }

}
