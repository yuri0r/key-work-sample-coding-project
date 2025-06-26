package de.keywork.backend.repository;

import de.keywork.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
