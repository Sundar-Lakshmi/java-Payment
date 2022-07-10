package com.beneficiary.beneficiary.service;

import com.beneficiary.beneficiary.model.BeneficiaryModel;
import com.beneficiary.beneficiary.payload.BeneficiaryRequest;
import com.beneficiary.beneficiary.payload.BeneficiaryResponse;
import com.beneficiary.beneficiary.repository.BeneificiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeneficiaryService {

    @Autowired
    BeneificiaryRepository beneificiaryRepository;
    public BeneficiaryResponse addBeneficiaries(BeneficiaryRequest beneficiaryRequest){
        BeneficiaryModel beneficiaryModel = BeneficiaryModel.builder()
                .accountNo(beneficiaryRequest.getAccountNo())
                .ifscCode(beneficiaryRequest.getIfscCode())
                .beneficiaryName(beneficiaryRequest.getBeneficiaryName())
                .beneficiaryAddedDate(beneficiaryRequest.getBeneficiaryAddedDate())
                .lastTransactionDate(beneficiaryRequest.getLastTransactionDate())
                .build();
        BeneficiaryModel UpdatedBeneficiaryModel = (BeneficiaryModel) beneificiaryRepository.save(beneficiaryModel);

    return BeneficiaryResponse
            .builder()
            .accountNo(UpdatedBeneficiaryModel.getAccountNo())
            .ifscCode(UpdatedBeneficiaryModel.getIfscCode())
            .beneficiaryName(UpdatedBeneficiaryModel.getBeneficiaryName())
            .beneficiaryId(UpdatedBeneficiaryModel.getBeneficiaryId())
            .beneficiaryAddedDate(UpdatedBeneficiaryModel.getBeneficiaryAddedDate())
            .lastTransactionDate(UpdatedBeneficiaryModel.getLastTransactionDate())
            .build();
    }
}
