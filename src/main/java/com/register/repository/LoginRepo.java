package com.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.register.model.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, String>{

}
