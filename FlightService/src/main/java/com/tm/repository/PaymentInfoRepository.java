package com.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tm.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String>{

}
