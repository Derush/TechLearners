package com.dbex.conndb.repository;

import com.dbex.conndb.model.UGC_Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UGCRepository extends MongoRepository<UGC_Course, String>{


}
