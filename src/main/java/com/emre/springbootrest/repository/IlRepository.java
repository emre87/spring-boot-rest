package com.emre.springbootrest.repository;

import com.emre.springbootrest.model.Il;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface IlRepository extends MongoRepository<Il, String> {
    List<Il> findAllByName(String name);
    Optional<Il> findByName(String name);

}
