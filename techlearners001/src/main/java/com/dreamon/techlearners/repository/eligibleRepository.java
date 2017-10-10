package com.dreamon.techlearners.repository;

import com.dreamon.techlearners.model.Eligi;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface eligibleRepository extends MongoRepository<Eligi, String> {
}
