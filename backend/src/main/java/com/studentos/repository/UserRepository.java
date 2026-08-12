package com.studentos.repository;

import com.studentos.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    boolean existsByEmail(String email);

    @EntityGraph(attributePaths = {"roles", "studentProfile"})
    Optional<User> findByEmail(String email);

    @EntityGraph(attributePaths = {"roles", "studentProfile"})
    Optional<User> findWithProfileByEmail(String email);

    @EntityGraph(attributePaths = {"roles", "studentProfile"})
    Optional<User> findWithProfileById(UUID id);
}
