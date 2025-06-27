package de.keywork.backend.repository;

import de.keywork.backend.entity.FormData;
import de.keywork.backend.entity.Jackpot;
import de.keywork.backend.entity.JackpotHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JackpotHistoryRepository extends JpaRepository<JackpotHistory, Long> {
    List<JackpotHistory> findByFormData(FormData formData);
}