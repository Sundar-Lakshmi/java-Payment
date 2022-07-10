package com.account.account.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@Table(name = "account")
@Entity
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_no")
    int accountNo;

    @Column(name="user_id")
    int userId;

    @Column(name="user_password")
    String userPassword;

    @Column(name="account_balance")
    int accountBalance;

    @Column(name="account_transaction_limit")
    int accountTransactionLimit;

    @Column(name="account_created_date")
    LocalDate accountCreatedDate;

    @Column(name="account_modified_date")
    LocalDate accountModifiedDate;
}
