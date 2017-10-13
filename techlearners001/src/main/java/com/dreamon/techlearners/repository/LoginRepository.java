package com.dreamon.techlearners.repository;

import com.dreamon.techlearners.model.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login,String> {
}
