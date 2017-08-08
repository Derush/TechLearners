package com.mongocon.learn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.mongocon.learn.model.Car;

public interface CarMongoRepository extends MongoRepository<Car, String> {

}
