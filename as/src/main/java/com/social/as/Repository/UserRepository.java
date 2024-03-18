package com.social.as.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.as.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
