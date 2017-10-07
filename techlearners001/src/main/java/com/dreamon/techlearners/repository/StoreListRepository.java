package com.dreamon.techlearners.repository;

import com.dreamon.techlearners.model.StoreList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface StoreListRepository extends CrudRepository<StoreList, String> {
}
