package com.account.account.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {
    int userId;
    String userPassword;
    int accountBalance;
    int accountTransactionLimit;
    LocalDate accountCreatedDate;
    LocalDate accountModifiedDate;
    int accountNo;

}
