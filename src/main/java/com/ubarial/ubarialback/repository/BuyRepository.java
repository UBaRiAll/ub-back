package com.ubarial.ubarialback.repository;

import com.ubarial.ubarialback.domain.Buy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyRepository extends JpaRepository<Buy, Long> {
}
