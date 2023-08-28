package com.paul.IMS.Account;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/accounts")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable UUID id) {
        return accountService.getAccountById(id);
    }

    @GetMapping("/username/{username}")
    public Optional<Account> getAccountByUsername(@PathVariable String username) {
        return accountService.getAccountByUsername(username);
    }

    @PostMapping
    public Account addAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    @PutMapping("/{id}")
    public Account updateAccount(@PathVariable UUID id, @RequestBody Account account) {
        account.setId(id);
        return accountService.saveAccount(account);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable UUID id) {
        accountService.deleteAccount(id);
    }

}
