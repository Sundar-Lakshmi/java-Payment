package com.credit.credit.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@Table(name = "credit")
@Entity
public class CreditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_id")
    int creditId;

    @Column(name = "date_of_credit")
    LocalDate dateOfCredit;

    @Column(name = "credit_amount")
    int creditAmount;

    @Column(name = "account_balance")
    int accountBalance;

    @Column(name = "account_no")
    int accountNo;
}
