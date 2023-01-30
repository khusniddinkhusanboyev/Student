package com.example.student.controller;

import com.example.student.model.RatesOfStudents;
import com.example.student.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marks")
public class RateController {
    @Autowired
    private final RateService rateService;

    public RateController(RateService rateService) {
        this.rateService = rateService;
    }

    @PostMapping("/input_rates")
    public ResponseEntity rate(@RequestBody RatesOfStudents ratesOfStudents){
        return ResponseEntity.ok(rateService.save(ratesOfStudents));
    }
}
