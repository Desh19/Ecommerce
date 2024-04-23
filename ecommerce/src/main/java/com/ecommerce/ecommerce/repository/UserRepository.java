package com.ecommerce.ecommerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.ecommerce.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
