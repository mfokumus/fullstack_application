package com.mfokumus.fullstackbackend.repository;

import com.mfokumus.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}
