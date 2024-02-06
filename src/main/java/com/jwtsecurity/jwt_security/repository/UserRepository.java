package com.jwtsecurity.jwt_security.repository;

import com.jwtsecurity.jwt_security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String string);
    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
