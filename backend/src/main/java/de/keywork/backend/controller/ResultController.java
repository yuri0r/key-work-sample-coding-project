package de.keywork.backend.controller;

import de.keywork.backend.dto.ResultDto;
import de.keywork.backend.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ResultController {
    private final ResultService resultService;

    @GetMapping("/result/{formId}")
    public ResultDto getRandomJackpot(@PathVariable long formId) {
        return resultService.getJakpot(formId);
    }

}
