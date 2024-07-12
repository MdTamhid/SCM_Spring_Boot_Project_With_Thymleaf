package com.tam.reository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tam.model.MyBoolList;
@Repository
public interface MyBookRepository extends JpaRepository<MyBoolList, Integer> {

}
