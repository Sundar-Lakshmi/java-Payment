package com.account.account.controller;

import com.account.account.payload.AccountRequest;
import com.account.account.payload.AccountResponse;
import com.account.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/test")
    public String getUser() {
        return "test";
    }

    @PostMapping(value = "/addAccounts")
    public ResponseEntity<AccountResponse> createAccount(@RequestBody AccountRequest accountRequest) {
        return ResponseEntity.ok(accountService.createAccount(accountRequest));
    }
}
