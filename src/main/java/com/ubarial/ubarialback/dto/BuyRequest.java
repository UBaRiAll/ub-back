package com.ubarial.ubarialback.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuyRequest {
    private String name;
    private String phone;
    private String address;
    private int price;
    private int quantity;

}
