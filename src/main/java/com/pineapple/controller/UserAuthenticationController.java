package com.pineapple.controller;

import com.pineapple.entity.UserEntity;
import com.pineapple.dto.UserDTO;
import com.pineapple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class UserAuthenticationController {

    @Autowired
    UserService userService;

    @GetMapping({"/users"})
    public ResponseEntity<?> getAllUsers(){
    List<UserDTO> userDTOList= userService.getAllUsers();

    return ResponseEntity.ok(userDTOList);
}

    @PostMapping({"/user"})
    public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO){
        UserEntity user= userService.addUser(userDTO);
        if(user.getUsername()!=null) {
            return ResponseEntity.ok("User added Successfully");
        }else{
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping({"/user"})
    public String updateUserById(@RequestBody UserDTO userDTO){
        UserEntity user= userService.updateUser(userDTO);
        return "User modified successfully";
    }

    @DeleteMapping({"/user"})
    public String deleteUserById(@RequestBody UserDTO userDTO){
        userService.deleteUser(userDTO);
        return "User Deleted successfully";
    }

}
