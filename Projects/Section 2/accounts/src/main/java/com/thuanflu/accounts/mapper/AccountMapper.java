package com.thuanflu.accounts.mapper;

import com.thuanflu.accounts.dto.AccountDTO;
import com.thuanflu.accounts.entity.Account;

public class AccountMapper {
    public static AccountDTO mapToAccountDTO(Account accounts, AccountDTO accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Account mapToAccount(AccountDTO accountsDto, Account accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
