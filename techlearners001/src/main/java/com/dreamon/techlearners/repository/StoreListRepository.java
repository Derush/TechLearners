package com.dreamon.techlearners.repository;

import com.dreamon.techlearners.model.StoreList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreListRepository extends MongoRepository<StoreList, String> {
}
