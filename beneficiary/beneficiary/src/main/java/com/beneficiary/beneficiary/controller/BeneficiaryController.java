package com.beneficiary.beneficiary.controller;

import com.beneficiary.beneficiary.payload.BeneficiaryRequest;
import com.beneficiary.beneficiary.payload.BeneficiaryResponse;
import com.beneficiary.beneficiary.service.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/beneficiaries")
public class BeneficiaryController {
    @Autowired
    BeneficiaryService beneficiaryService;

    @GetMapping(value = "/addBeneficiaries")
    public String getBeneficiaries()
        {
            return "test";
        }

    @PostMapping(value="/addAccounts")
    public ResponseEntity<BeneficiaryResponse> addBeneficiaries(@RequestBody BeneficiaryRequest beneficiaryRequest){
        return ResponseEntity.ok(beneficiaryService.addBeneficiaries(beneficiaryRequest));
    }

}
