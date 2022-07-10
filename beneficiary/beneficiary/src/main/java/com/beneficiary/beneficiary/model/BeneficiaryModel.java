package com.beneficiary.beneficiary.model;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@Table(name = "beneficiary")
@Entity

public class BeneficiaryModel {

    @Column(name = "account_no")
    int accountNo;

    @Column(name ="ifsc_code")
    String ifscCode;

    @Column(name = "beneficiary_name")
    String beneficiaryName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beneficiary_id")
    int beneficiaryId;

    @Column(name = "beneficiary_added_date")
    LocalDate beneficiaryAddedDate;

    @Column(name = "last_transaction_date")
    LocalDate lastTransactionDate;

}
