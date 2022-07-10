package com.credit.credit.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreditResponse {
    int creditId;
    int creditAmount;
    LocalDate dateOfCredit;
    int accountNo;
    int accountBalance;
}
