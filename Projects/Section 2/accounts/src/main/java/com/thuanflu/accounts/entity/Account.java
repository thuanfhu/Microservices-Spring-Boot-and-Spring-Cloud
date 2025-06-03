package com.thuanflu.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account extends BaseEntity {
    @Column
    Long customerId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long accountNumber;

    @Column
    String accountType;

    @Column
    String branchAddress;
}
