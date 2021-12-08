package com.techelevator.dao;

import com.techelevator.model.User;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.List;
@Component
public interface UserDao {


    long getUserIdByPrincipal(Principal principal);

    List<User> findAll();

    User getUserById(Long userId);

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password, String role);
}
