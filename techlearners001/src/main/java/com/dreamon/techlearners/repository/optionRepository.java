package com.dreamon.techlearners.repository;
import com.dreamon.techlearners.model.option;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  optionRepository extends MongoRepository<option, String>{
}
