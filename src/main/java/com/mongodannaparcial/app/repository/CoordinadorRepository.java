package com.mongodannaparcial.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodannaparcial.app.entity.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String> {

}
