package com.ubarial.ubarialback.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BuyReturn {
    private String idx;
    private String name;
    private String phone;
    private String address;
    private int price;
    private int quantity;
    private Date orderdate;
}
