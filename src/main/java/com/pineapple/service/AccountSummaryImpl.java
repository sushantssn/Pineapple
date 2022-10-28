package com.pineapple.service;

import com.pineapple.dto.AccountDTO;
import com.pineapple.entity.Account;
import com.pineapple.entity.Transaction;
import com.pineapple.pojo.AccountConstants;
import com.pineapple.repositories.AccountRepository;
import com.pineapple.repositories.TransactionsRepository;
import com.pineapple.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AccountSummaryImpl implements AccountSummary{

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserRepository userRepository;
    @Autowired
    TransactionsRepository transactionsRepository;

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
        transactionsRepository.save(setTransationalData(accountDTO));
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

    private Transaction setTransationalData(AccountDTO accountDTO) {
        Transaction transaction = new Transaction();
        transaction.setCreditAccount(AccountConstants.BussinessAccount);
        transaction.setModeOfTransaction("Check");
        transaction.setDebitAccount(userRepository.findById(accountDTO.getUserId()).get().getUserWallet().getUserAccountNumber());
        transaction.setTransactionDate(new Date());
        transaction.setTransactionType("credit");
        transaction.setAmount((double) accountDTO.getInvestedAmount());
        return transaction;
    }
}
