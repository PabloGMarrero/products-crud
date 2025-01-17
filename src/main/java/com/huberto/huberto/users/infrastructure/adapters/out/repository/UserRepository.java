package com.huberto.huberto.users.infrastructure.adapters.out.repository;

import com.huberto.huberto.users.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByEmail(String email);
}
