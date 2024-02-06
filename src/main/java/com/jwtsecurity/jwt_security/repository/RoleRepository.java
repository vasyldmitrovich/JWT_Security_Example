package com.jwtsecurity.jwt_security.repository;

import com.jwtsecurity.jwt_security.entity.ERole;
import com.jwtsecurity.jwt_security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
