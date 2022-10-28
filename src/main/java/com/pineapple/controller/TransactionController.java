package com.pineapple.controller;

import com.pineapple.entity.Transaction;
import com.pineapple.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    public ResponseEntity<List<Transaction>> getAllTransactions(){

        return (ResponseEntity<List<Transaction>>) transactionService.getAllTransactions();

    }


}
