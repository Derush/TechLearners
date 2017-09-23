package com.dreamon.techlearners.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.dreamon.techlearners.model.eligible;

public interface  eligibleRepository extends MongoRepository<eligible, String>{
}
