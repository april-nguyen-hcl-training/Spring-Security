package com.hcl.secureauthenticator.service;

import com.hcl.secureauthenticator.model.User;
import com.hcl.secureauthenticator.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private static final Logger log = LogManager.getLogger(UserService.class);

  @Autowired
  private UserRepository userRepository;

  public boolean validUser(String username, String password) {
    log.debug("Checking if username and password exists...");
    return this.userRepository.existsByUsernameAndPassword(username, password);
  }

  public User getUser(String username, String password) {
    log.debug("Getting user...");
    return this.userRepository.getByUsernameAndPassword(username, password);
  }

  public User findByUsername(String username) {
    log.debug("Finding user with username: " + username);
    return this.userRepository.findByUsername(username);
  }
}
