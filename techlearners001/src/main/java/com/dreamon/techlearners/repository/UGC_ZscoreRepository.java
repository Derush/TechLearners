package com.dreamon.techlearners.repository;

import com.dreamon.techlearners.model.UGC_Course;
import com.dreamon.techlearners.model.UGC_Zscore;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UGC_ZscoreRepository extends MongoRepository<UGC_Zscore, String> {
}
