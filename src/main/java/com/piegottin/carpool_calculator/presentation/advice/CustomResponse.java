package com.piegottin.carpool_calculator.presentation.advice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CustomResponse {
    private String status;
    private String message;
}
