package com.thuanflu.accounts.service.implement;

import com.thuanflu.accounts.constant.AccountConstant;
import com.thuanflu.accounts.dto.CustomerDTO;
import com.thuanflu.accounts.entity.Account;
import com.thuanflu.accounts.entity.Customer;
import com.thuanflu.accounts.exception.CustomerAlreadyExistedException;
import com.thuanflu.accounts.mapper.CustomerMapper;
import com.thuanflu.accounts.repository.AccountRepository;
import com.thuanflu.accounts.repository.CustomerRepository;
import com.thuanflu.accounts.service.IAccountService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AccountServiceImpl implements IAccountService {
    AccountRepository accountRepository;
    CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDTO customerDTO){
        // Handle duplicate mobile number
        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDTO.getMobileNumber());
        if(optionalCustomer.isPresent()){
            throw new CustomerAlreadyExistedException(
                    "Customer already existed with given mobile number"
                    + customerDTO.getMobileNumber());
        }

        Customer customer = CustomerMapper.mapToCustomer(customerDTO, new Customer());
        customer.setCreatedAt(LocalDateTime.now());
        customer.setCreatedBy("Anonymous");
        Customer savedCustomer = customerRepository.save(customer);

        accountRepository.save(createNewAccount(savedCustomer));
    }

    private Account createNewAccount(Customer customer) {
        Account newAccount = new Account();

        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);
        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountConstant.SAVINGS);
        newAccount.setBranchAddress(AccountConstant.ADDRESS);
        newAccount.setCreatedAt(LocalDateTime.now());
        newAccount.setCreatedBy("Anonymous");

        return newAccount;
    }
}
