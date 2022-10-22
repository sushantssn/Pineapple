package com.pineapple.service;

import com.pineapple.pojo.Account;
import com.pineapple.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountSummaryImpl implements AccountSummary{

    @Autowired
    AccountRepository accountRepository;

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


}
