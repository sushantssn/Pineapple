package com.pineapple.service;

import com.pineapple.model.UserEntity;
import com.pineapple.model.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getAllUsers();

    UserEntity addUser(UserDTO userDTO);

    UserEntity updateUser(UserDTO userDTO);

    void deleteUser(UserDTO userDTO) ;

    }

