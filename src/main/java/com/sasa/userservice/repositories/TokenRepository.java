package com.sasa.userservice.repositories;

import com.sasa.userservice.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Optional<Token>
    findByValueAndDeletedAndExpiryAtGreaterThan(String value, Boolean deleted, Date expiry);
}
