package com.credit.credit.service;

import com.credit.credit.model.CreditModel;
import com.credit.credit.payload.CreditRequest;
import com.credit.credit.payload.CreditResponse;
import com.credit.credit.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditService {

    @Autowired
    CreditRepository creditRepository;
    public CreditResponse creditMoney(CreditRequest creditRequest) {
        CreditModel creditModel = CreditModel.builder()
                .dateOfCredit(creditRequest.getDateOfCredit())
                .creditAmount(creditRequest.getCreditAmount())
                .accountNo(creditRequest.getAccountNo())
                .accountBalance(creditRequest.getAccountBalance())
                .build();

    CreditModel UpdatedCreditModel = (CreditModel)  creditRepository.save(creditModel);


    return CreditResponse
            .builder()
            .creditId(UpdatedCreditModel.getCreditId())
            .dateOfCredit(UpdatedCreditModel.getDateOfCredit())
            .creditAmount(UpdatedCreditModel.getCreditAmount())
            .accountNo(UpdatedCreditModel.getAccountNo())
            .accountBalance(UpdatedCreditModel.getAccountBalance())
            .build();
    }
}
