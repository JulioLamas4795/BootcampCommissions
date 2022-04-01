package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommissionDto {

    private String id;
    private String name;

    private Double amount;
    private Integer numTransactionToPay;
    private String typeOfAccount;

    private String idClient;
    private String idAccount;


}
