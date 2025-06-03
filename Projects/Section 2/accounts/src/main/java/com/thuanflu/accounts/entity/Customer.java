package com.thuanflu.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customerId;

    @Column
    String name;

    @Column(unique = true)
    String email;

    @Column(unique = true)
    String mobileNumber;
}
