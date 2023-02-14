package com.dzaton.mscv.users.services;

import com.dzaton.mscv.users.models.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> findAll();
    Optional<User> byId(Long id);
    User save(User user);
    void delete(Long id);
}
