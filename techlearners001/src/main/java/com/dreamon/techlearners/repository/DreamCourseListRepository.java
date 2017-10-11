package com.dreamon.techlearners.repository;

import com.dreamon.techlearners.model.DreamCoursePrint;
import com.dreamon.techlearners.model.StoreList;
import org.springframework.data.repository.CrudRepository;

public interface DreamCourseListRepository extends CrudRepository<DreamCoursePrint, String> {
}
