package com.account.account.service;

import com.account.account.model.AccountModel;
import com.account.account.payload.AccountRequest;
import com.account.account.payload.AccountResponse;
import com.account.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public AccountResponse createAccount(AccountRequest accountRequest) {
        AccountModel accountModel = AccountModel.builder()
                .userId(accountRequest.getUserId())
                .userPassword(accountRequest.getUserPassword())
                .accountBalance(accountRequest.getAccountBalance())
                .accountTransactionLimit(accountRequest.getAccountTransactionLimit())
                .accountCreatedDate(accountRequest.getAccountCreatedDate())
                .accountModifiedDate(accountRequest.getAccountModifiedDate())
                .build();
        AccountModel UpdatedAccountModel = (AccountModel) accountRepository.save(accountModel);

        return AccountResponse.builder()
                .userId(UpdatedAccountModel.getUserId())
                .userPassword(UpdatedAccountModel.getUserPassword())
                .accountBalance(UpdatedAccountModel.getAccountBalance())
                .accountTransactionLimit(UpdatedAccountModel.getAccountTransactionLimit())
                .accountCreatedDate(UpdatedAccountModel.getAccountCreatedDate())
                .accountModifiedDate(UpdatedAccountModel.getAccountModifiedDate())
                .accountNo(UpdatedAccountModel.getAccountNo())
                .build();

    }
}
