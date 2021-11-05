package com.jero.personal.utilities.repository;

import com.jero.personal.utilities.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface User repository.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
