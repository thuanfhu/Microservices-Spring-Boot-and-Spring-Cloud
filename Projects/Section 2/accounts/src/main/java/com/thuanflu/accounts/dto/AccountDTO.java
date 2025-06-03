package com.thuanflu.accounts.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountDTO {
    Long accountNumber;
    String accountType;
    String branchAddress;
}
