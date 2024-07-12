package com.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tm.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long>{

}
