package com.fatou.OneToOne1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatou.OneToOne1.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
