package com.example.LedLuqi.repo;

import com.example.LedLuqi.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
