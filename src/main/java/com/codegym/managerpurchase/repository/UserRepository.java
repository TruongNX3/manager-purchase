package com.codegym.managerpurchase.repository;

import com.codegym.managerpurchase.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
