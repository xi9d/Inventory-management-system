package com.paul.IMS.Account;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountService {
    List<Account> getAllAccounts();
    Optional<Account> getAccountById(UUID id);
    Optional<Account> getAccountByUsername(String username);
    Account saveAccount(Account account);
    void deleteAccount(UUID id);
}
