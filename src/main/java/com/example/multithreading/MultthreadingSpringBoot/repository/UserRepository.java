package com.example.multithreading.MultthreadingSpringBoot.repository;

import com.example.multithreading.MultthreadingSpringBoot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
