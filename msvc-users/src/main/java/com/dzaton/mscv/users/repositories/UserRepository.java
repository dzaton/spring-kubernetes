package com.dzaton.mscv.users.repositories;

import com.dzaton.mscv.users.models.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<User, Long> {


}
