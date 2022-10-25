package com.pineapple.service;

import com.pineapple.pojo.Account;
import com.pineapple.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountSummaryImpl implements AccountSummary{

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAll() {
        List<Account> accountList = accountRepository.findAll();
        return accountList;
    }


    public List<Account> getAll(int id) {
      List<Account> accountList = accountRepository.findByUserId(id);
        return accountList;
    }

    @Override
    public void add(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void update(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void delete(Account account) {
        accountRepository.delete(account);
    }

    @Override
    public Account findById(int id) {

        Optional<Account> account = accountRepository.findById(id);
        if(account.isEmpty()){
            return null;
        }else{
            return account.get();
        }
    }


}
