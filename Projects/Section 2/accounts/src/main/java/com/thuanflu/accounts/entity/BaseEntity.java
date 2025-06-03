package com.thuanflu.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter @ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseEntity {
    @Column(updatable = false)
    LocalDateTime createdAt;

    @Column(updatable = false)
    String createdBy;

    @Column(insertable = false)
    LocalDateTime updatedAt;

    @Column(insertable = false)
    String updatedBy;
}
