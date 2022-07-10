package com.credit.credit.controller;

import com.credit.credit.payload.CreditRequest;
import com.credit.credit.payload.CreditResponse;
import com.credit.credit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/credit")
public class CreditController {
    @Autowired
    CreditService creditService;

    @PostMapping(value="/creditMoney")
    public ResponseEntity<CreditResponse> creditMoney(@RequestBody CreditRequest creditRequest){
        return ResponseEntity.ok(creditService.creditMoney(creditRequest));
    }

}
