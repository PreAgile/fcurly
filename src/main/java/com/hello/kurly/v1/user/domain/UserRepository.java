package com.hello.kurly.v1.user.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByNickname(String nickname);

  Optional<User> findByEmail(String email);

  boolean existsByNickname(String nickname);

  boolean existsByEmail(String email);
}
