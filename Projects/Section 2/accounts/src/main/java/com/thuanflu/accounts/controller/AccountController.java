package com.thuanflu.accounts.controller;

import com.thuanflu.accounts.constant.AccountConstant;
import com.thuanflu.accounts.dto.CustomerDTO;
import com.thuanflu.accounts.dto.ResponseDTO;
import com.thuanflu.accounts.service.IAccountService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AccountController {
    IAccountService accountService;

    @PostMapping
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO) {
        accountService.createAccount(customerDTO);

        // Build response to user
        ResponseDTO response = ResponseDTO.builder()
                .statusCode(AccountConstant.STATUS_201)
                .statusMsg(AccountConstant.MESSAGE_201)
                .build();

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}
