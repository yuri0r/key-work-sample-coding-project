package de.keywork.backend.service;

import de.keywork.backend.dto.ResultDto;
import de.keywork.backend.entity.FormData;
import de.keywork.backend.entity.Jackpot;
import de.keywork.backend.entity.JackpotHistory;
import de.keywork.backend.repository.FormDataRepository;
import de.keywork.backend.repository.JackpotHistoryRepository;
import de.keywork.backend.repository.JackpotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
@Transactional
public class ResultService {

    private final FormDataRepository formDataRepository;
    private final JackpotRepository jackpotRepository;
    private final JackpotHistoryRepository jackpotHistoryRepository;
    public ResultDto getJackpot(long formId) {
        // check form id
        Optional<FormData> foundFormData = formDataRepository.findById(formId);
        if (foundFormData.isEmpty()) {
            throw new RuntimeException("Form Id does not exist");
        }
        FormData formData = foundFormData.get();
        // check if user can still play
        List<JackpotHistory> history = jackpotHistoryRepository.findByFormData(formData);

        for (JackpotHistory pastAttempt: history) {
            if (!pastAttempt.getJackpot().contains("Retry")) {
                //this means the user has played before and its not the retry price
                return new ResultDto(pastAttempt.getJackpot(), formId, jackpotRepository.findByName(pastAttempt.getJackpot()).getDescription());
            }
        }

        // choose random jackpot
        List<Jackpot> jackpots = jackpotRepository.findAll();
        Random random = new Random();
        Jackpot randomJackpot = jackpots.get(random.nextInt(jackpots.size()));
        JackpotHistory attempt = new JackpotHistory();
        attempt.setFormData(formData);
        attempt.setJackpot(randomJackpot.getName());
        ResultDto result = new ResultDto(randomJackpot.getName(), formId, randomJackpot.getDescription());
        jackpotHistoryRepository.save(attempt);
        return result;

    }
}
