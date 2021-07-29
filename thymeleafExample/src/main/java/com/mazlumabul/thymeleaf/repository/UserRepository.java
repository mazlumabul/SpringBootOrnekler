package com.mazlumabul.thymeleaf.repository;

import com.mazlumabul.thymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
