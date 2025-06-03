package com.thuanflu.accounts.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ErrorResponseDTO {
    String apiPath;
    HttpStatus errorCode;
    String errorMessage;
    LocalDateTime errorTime;
}
