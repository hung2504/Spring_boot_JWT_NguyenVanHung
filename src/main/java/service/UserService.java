package service;

import authen.UserPrincipal;
import entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}