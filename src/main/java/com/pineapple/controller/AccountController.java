package com.pineapple.controller;

import com.pineapple.model.UserDTO;
import com.pineapple.pojo.Account;
import com.pineapple.service.AccountSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AccountController {
    @Autowired
    AccountSummary accountSummary;

    @PostMapping("/getuseraccount")
    public ModelAndView getUserAccount(@RequestBody UserDTO userDTO){
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.getModelMap().put("todo-list",accountSummary.getAll(userDTO.getId()));
        return modelAndView;
    }

    @PostMapping("/adduseraccount")
    public ResponseEntity<?> addUserAccount(@RequestBody Account account){
       accountSummary.add(account);
        return ResponseEntity.ok("Account added Successfully");
    }

    @PostMapping("/updateuseraccount")
    public ResponseEntity<?> updateUserAccount(@RequestBody Account account){
        accountSummary.update(account);
        return ResponseEntity.ok("Account added Successfully");
    }

    @PostMapping("/deleteuseraccount")
    public ResponseEntity<?> deleteUserAccount(@RequestBody Account account){
        accountSummary.delete(account);
        return ResponseEntity.ok("Account added Successfully");
    }
}
