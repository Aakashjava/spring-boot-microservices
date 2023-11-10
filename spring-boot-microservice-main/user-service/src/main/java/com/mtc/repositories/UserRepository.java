package com.mtc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mtc.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
