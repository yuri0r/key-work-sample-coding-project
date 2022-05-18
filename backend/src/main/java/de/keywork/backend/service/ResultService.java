package de.keywork.backend.service;

import de.keywork.backend.dto.ResultDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ResultService {

    public ResultDto getJakpot(long formId) {
        return new ResultDto("Jackpot", formId);
    }
}
