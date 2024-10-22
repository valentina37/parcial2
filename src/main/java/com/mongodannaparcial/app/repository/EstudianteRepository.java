package com.mongodannaparcial.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodannaparcial.app.entity.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, String> {

	
	 List<Estudiante> findAllByOrderByPuntajeDesc();

}
