package com.ubarial.ubarialback.service;


import com.ubarial.ubarialback.domain.Buy;
import com.ubarial.ubarialback.dto.BuyRequest;
import com.ubarial.ubarialback.dto.BuyReturn;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ubarial.ubarialback.repository.BuyRepository;

@RequiredArgsConstructor
@Service
public class BuyService {

    @Autowired
    private BuyRepository buyRepository;


    public ResponseEntity<BuyReturn> buyProduct(BuyRequest buyRequest) {
        // entity 로 변환, 빌더 사용
        Buy buy = Buy.builder()
                .name(buyRequest.getName())
                .phone(buyRequest.getPhone())
                .address(buyRequest.getAddress())
                .price(buyRequest.getPrice())
                .quantity(buyRequest.getQuantity())
                .build();

        // 저장이 성공할 경우
        Buy savedBuy = buyRepository.save(buy);
        //BuyReturn으로 변환
        //BuyReturn DTO 로 변환
        BuyReturn buyReturn = new BuyReturn();
        buyReturn.setIdx(savedBuy.getId().toString());
        buyReturn.setName(savedBuy.getName());
        buyReturn.setPhone(savedBuy.getPhone());
        buyReturn.setAddress(savedBuy.getAddress());
        buyReturn.setPrice(savedBuy.getPrice());
        buyReturn.setQuantity(savedBuy.getQuantity());
        buyReturn.setOrderdate(savedBuy.getOrderDate());

        // buyReturn 리턴
        // 저장 성공 시 buyReturn 리턴
        if (savedBuy != null) {
            return ResponseEntity.ok(buyReturn);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
//        // 저장이 성공할 경우 성공 메시지return
//        if(buyRepository.save(buy) != null){
//            // buy 엔티티와 구매 성공  메시지 리턴
//            return ResponseEntity.ok("구매 성공: " + buy.toString());
//
//        }
//        else {
//            return ResponseEntity.badRequest().body("구매 실패");
//        }
}
