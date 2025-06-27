package de.keywork.backend.repository;

import de.keywork.backend.entity.Jackpot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JackpotRepository extends JpaRepository<Jackpot, Long> {
    Jackpot findByName(String name);
}