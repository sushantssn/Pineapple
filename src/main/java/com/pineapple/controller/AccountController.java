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

    @GetMapping("/")
    public ModelAndView showWelcomePage(){
        ModelAndView modelAndView = new ModelAndView("welcome");
        return modelAndView;
    }
    @GetMapping("/getuseraccount")
    public ModelAndView getUserAccount(){
        ModelAndView modelAndView = new ModelAndView("list-todos");
        modelAndView.getModelMap().put("todos",accountSummary.getAll());
        return modelAndView;
    }

    @GetMapping("/update-todo")
    public ModelAndView getUserAccount(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("todo");
        modelAndView.getModelMap().put("Account",(accountSummary.findById(id) == null) ? null : accountSummary.findById(id));
        return modelAndView;
    }

    @PostMapping("/adduseraccount")
    public ResponseEntity<?> addUserAccount(@RequestBody Account account){
       accountSummary.add(account);
        return ResponseEntity.ok("Account added Successfully");
    }

    @PutMapping("/updateuseraccount")
    public ResponseEntity<?> updateUserAccount(@RequestBody Account account){
        accountSummary.update(account);
        return ResponseEntity.ok("Account added Successfully");
    }

    @DeleteMapping("/deleteuseraccount")
    public ResponseEntity<?> deleteUserAccount(@RequestBody Account account){
        accountSummary.delete(account);
        return ResponseEntity.ok("Account added Successfully");
    }
}
