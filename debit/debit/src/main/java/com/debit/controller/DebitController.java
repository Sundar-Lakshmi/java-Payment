package com.debit.controller;

import com.debit.Service.DebitService;
import com.debit.payload.DebitRequest;
import com.debit.payload.DebitResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debit")
public class DebitController {
    @Autowired
    DebitService debitService;


    @PostMapping(value="/debitMoney")
    public ResponseEntity<DebitResponse> debitMoney (@RequestBody DebitRequest debitRequest){
        return ResponseEntity.ok(debitService.debitMoney(debitRequest));
    }
}
