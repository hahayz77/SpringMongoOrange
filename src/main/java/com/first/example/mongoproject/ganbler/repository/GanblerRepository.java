package com.first.example.mongoproject.ganbler.repository;

import com.first.example.mongoproject.ganbler.model.Ganbler;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GanblerRepository extends MongoRepository<Ganbler, String> {
}
