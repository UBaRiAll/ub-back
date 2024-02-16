package com.ubarial.ubarialback.controller;

import com.ubarial.ubarialback.dto.BuyRequest;
import com.ubarial.ubarialback.dto.BuyReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ubarial.ubarialback.service.BuyService;


@RestController
@RequestMapping("/api")
public class BuyController {

    @Autowired
    private BuyService buyService;

    @ResponseBody
    @PostMapping("/buy")
    //com.ubarial.ubarialback.dto 로 입력받음
    public ResponseEntity<BuyReturn> buyProduct(@RequestBody BuyRequest buyRequest){

        //구매 로직
        return buyService.buyProduct(buyRequest);
    }

}
