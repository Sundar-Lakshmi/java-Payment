package com.beneficiary.beneficiary.payload;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiaryResponse {
    int accountNo;
    String ifscCode;
    String beneficiaryName;
    LocalDate beneficiaryAddedDate;
    LocalDate lastTransactionDate;
    int beneficiaryId;
}
