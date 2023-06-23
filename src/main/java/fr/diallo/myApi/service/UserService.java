package fr.diallo.myApi.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.diallo.myApi.model.User;

@Service
public class UserService {
  private  ArrayList<User> users;

  public UserService() {
    this.users = new ArrayList<User>();

    this.users.add(new User(0, "Melanie", 41));
    this.users.add(new User(1, "jul", 8));
    this.users.add(new User(2, "Bertrand", 27));
  }

  public User getUsers(int id) {
    for (User user : this.users) {
      if (user.getId() == id) {
        return user;
      }
    }
    
    return null;
  }
}
