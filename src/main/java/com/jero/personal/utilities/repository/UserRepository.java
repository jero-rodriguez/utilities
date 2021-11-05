package com.jero.personal.utilities.repository;

import com.jero.personal.utilities.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
