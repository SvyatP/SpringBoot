package com.itm.springboot.repository;

import com.itm.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

}
