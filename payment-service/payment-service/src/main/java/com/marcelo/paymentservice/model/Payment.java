package com.marcelo.paymentservice.model;

import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
public class Payment implements Serializable {
    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;

}
