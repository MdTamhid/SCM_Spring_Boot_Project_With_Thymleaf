package com.tm.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tm.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
