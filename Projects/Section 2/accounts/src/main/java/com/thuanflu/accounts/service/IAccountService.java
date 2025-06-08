package com.thuanflu.accounts.service;

import com.thuanflu.accounts.dto.CustomerDTO;

public interface IAccountService {
    void createAccount(CustomerDTO customerDTO);

    CustomerDTO fetchAccountDetail(String mobileNumber);

    boolean updateAccount(CustomerDTO customerDTO);

    boolean deleteAccount(String mobileNumber);
}
