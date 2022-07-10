package com.debit.Service;

import com.debit.model.DebitModel;
import com.debit.payload.DebitRequest;
import com.debit.payload.DebitResponse;
import com.debit.repository.DebitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DebitService {
    @Autowired
    DebitRepository debitRepository;
    public DebitResponse debitMoney(DebitRequest debitRequest){
        DebitModel debitModel = DebitModel.builder()
                .beneficiaryId(debitRequest.getBeneficiaryId())
                .debitAmount(debitRequest.getDebitAmount())
                .dateOfDebit(debitRequest.getDateOfDebit())
                .accountBalance(debitRequest.getAccountBalance())
                .build();
        DebitModel UpdatedDebitModel = (DebitModel) debitRepository.save(debitModel);

        return DebitResponse.builder()
                .debitId(UpdatedDebitModel.getDebitId())
                .beneficiaryId(UpdatedDebitModel.getBeneficiaryId())
                .debitAmount(UpdatedDebitModel.getDebitAmount())
                .dateOfDebit(UpdatedDebitModel.getDateOfDebit())
                .accountBalance(UpdatedDebitModel.getAccountBalance())
                .build();
    }
}
