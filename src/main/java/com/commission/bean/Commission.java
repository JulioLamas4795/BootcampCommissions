package com.commission.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "commission")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commission {

    @Id
    private String id;
    private String name;

    private Double amount;
    private Integer numTransactionToPay;
    private String typeOfAccount;

    private String idClient;
    private String idAccount;


}
