package com.pineapple.service;

import com.pineapple.dto.AccountDTO;
import com.pineapple.entity.Account;
import java.util.List;

public interface AccountSummary {

    public List<Account> getAll();
    public List<Account> getAll(int id);

    void add(AccountDTO account);

    void update(AccountDTO account);

    void delete(AccountDTO account);

    Account findById(int id);
}
