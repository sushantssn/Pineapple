package com.pineapple.controller;

import com.pineapple.dto.AccountDTO;
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
    public ResponseEntity<?> addUserAccount(@RequestBody AccountDTO accountDTO){
       accountSummary.add(accountDTO);
        return ResponseEntity.ok("Account added Successfully");
    }

    @PutMapping("/updateuseraccount")
    public ResponseEntity<?> updateUserAccount(@RequestBody AccountDTO accountDTO){
        accountSummary.update(accountDTO);
        return ResponseEntity.ok("Account added Successfully");
    }

    @DeleteMapping("/deleteuseraccount")
    public ResponseEntity<?> deleteUserAccount(@RequestBody AccountDTO accountDTO){
        accountSummary.delete(accountDTO);
        return ResponseEntity.ok("Account added Successfully");
    }
}
