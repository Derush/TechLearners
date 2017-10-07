package com.dreamon.techlearners.repository;
import com.dreamon.techlearners.model.option;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface  optionRepository extends MongoRepository<option, String>{
}
