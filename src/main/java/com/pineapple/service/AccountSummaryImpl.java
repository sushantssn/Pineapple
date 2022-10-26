package com.pineapple.service;

import com.pineapple.dto.AccountDTO;
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
    public void add(AccountDTO accountDTO) {

        accountRepository.save(mapAccountDtoToAccount(accountDTO));
    }

    @Override
    public void update(AccountDTO accountDTO) {
        accountRepository.save(mapAccountDtoToAccount(accountDTO));
    }

    @Override
    public void delete(AccountDTO accountDTO) {
        accountRepository.delete(mapAccountDtoToAccount(accountDTO));
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

    private Account mapAccountDtoToAccount(AccountDTO accountDTO) {
        Account account = new Account();
        account.setUserId(accountDTO.getUserId());
        account.setUserName(accountDTO.getUserName());
        account.setInvestedAmount(accountDTO.getInvestedAmount());
        account.setMaturityAmount(accountDTO.getMaturityAmount());
        account.setInvestmentDate(accountDTO.getInvestmentDate());
        account.setMaturityDate(accountDTO.getMaturityDate());
        account.setSchemeDes(accountDTO.getSchemeDes());
        return account;
    }

}
