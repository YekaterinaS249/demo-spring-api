package com.silantyeva.yekaterina.repository;

import com.silantyeva.yekaterina.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
