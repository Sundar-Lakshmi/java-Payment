package com.debit.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@Table(name = "debit")
@Entity
public class DebitModel {
    @Column(name = "beneficiary_id")
    int beneficiaryId;

    @Column(name = "date_of_debit")
    LocalDate dateOfDebit;

    @Column(name = "debit_amount")
    int debitAmount;

    @Column(name = "account_balance")
    int accountBalance;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "debit_id")
    int debitId;

}
