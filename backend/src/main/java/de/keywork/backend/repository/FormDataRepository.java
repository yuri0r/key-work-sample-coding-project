package de.keywork.backend.repository;

import de.keywork.backend.entity.FormData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormDataRepository extends JpaRepository<FormData, Long> {
}
