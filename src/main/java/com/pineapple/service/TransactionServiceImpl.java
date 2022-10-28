package com.pineapple.service;

import com.pineapple.entity.Transaction;
import com.pineapple.repositories.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{


    @Autowired
    TransactionsRepository transactionsRepository;


    @Override
    public List<Transaction> getAllTransactions() {
        return transactionsRepository.findAll();
    }
}
