package com.hcl.secureauthenticator.repository;

import com.hcl.secureauthenticator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
  boolean existsByUsernameAndPassword(String username, String password);
  User getByUsernameAndPassword(String username, String password);
  User findByUsername(String username);
}
