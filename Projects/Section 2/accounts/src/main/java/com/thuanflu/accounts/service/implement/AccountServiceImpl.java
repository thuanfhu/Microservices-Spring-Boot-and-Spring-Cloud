package com.thuanflu.accounts.service.implement;

import com.thuanflu.accounts.dto.CustomerDTO;
import com.thuanflu.accounts.repository.AccountRepository;
import com.thuanflu.accounts.service.IAccountService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AccountServiceImpl implements IAccountService {
    AccountRepository accountRepository;

    @Override
    public void createAccount(CustomerDTO customerDTO){

    }
}
