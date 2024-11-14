package com.moudjane.birthdayjava.repository;

import com.moudjane.birthdayjava.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAll();
}