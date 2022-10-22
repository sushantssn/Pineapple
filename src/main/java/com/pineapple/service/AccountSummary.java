package com.pineapple.service;

import com.pineapple.pojo.Account;
import java.util.List;

public interface AccountSummary {

    public List<Account> getAll(int id);

    void add(Account account);

    void update(Account account);

    void delete(Account account);
}
