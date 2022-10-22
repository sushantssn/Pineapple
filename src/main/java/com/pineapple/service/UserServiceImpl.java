package com.pineapple.service;

import com.pineapple.model.UserEntity;
import com.pineapple.model.UserDTO;
import com.pineapple.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userDao;

    @Autowired
    @Lazy
    private PasswordEncoder bcryptEncoder;

    @Override
    public List<UserDTO> getAllUsers() {
        return userDao.findAll().stream().map(e-> new UserDTO(e.getId(),e.getUsername(),e.getPassword(),e.getUserType(),e.getIsAdmin())).collect(Collectors.toList());
    }

    @Override
    public UserEntity addUser(UserDTO userDTO) {


        UserEntity newUser = new UserEntity();
        newUser.setUsername(userDTO.getUsername());
        newUser.setPassword(userDTO.getPassword());
        newUser.setUserType(userDTO.getUsertype());
        newUser.setIsAdmin(userDTO.getIsAdmin());
         UserEntity user = userDao.save(newUser);
         return user;
    }

    @Override
    public UserEntity updateUser(UserDTO userDTO) {
        UserEntity newUser = new UserEntity();
        newUser.setId(userDTO.getId());
        newUser.setUsername(userDTO.getUsername());
        newUser.setPassword(userDTO.getPassword());
        newUser.setUserType(userDTO.getUsertype());
        newUser.setIsAdmin(userDTO.getIsAdmin());
        UserEntity user = userDao.save(newUser);
        return user;
    }

    public void deleteUser(UserDTO userDTO) {
        UserEntity newUser = new UserEntity();
        newUser.setId(userDTO.getId());
        userDao.delete(newUser);
    }

}
