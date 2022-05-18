package de.keywork.backend.controller;

import de.keywork.backend.dto.FormDataDto;
import de.keywork.backend.service.FormDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class FormController {

    private final FormDataService formDataService;

    @PostMapping("/form")
    public long saveFormData(@RequestBody FormDataDto dataDto) {
        return formDataService.saveFormData(dataDto);
    }

    @GetMapping("/form/{formId}")
    public FormDataDto saveFormData(@PathVariable long formId) {
        return formDataService.getFormData(formId);
    }

}
