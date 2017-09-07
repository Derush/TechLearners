package com.dreamon.techlearners.repository;

import com.dreamon.techlearners.model.UGC_Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UGCRepository extends MongoRepository<UGC_Course, String>{


}











