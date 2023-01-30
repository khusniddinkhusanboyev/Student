package com.example.student.service;

import com.example.student.model.RatesOfStudents;
import com.example.student.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateService {
    @Autowired
    private final RateRepository rateRepository;


    public RateService(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    public RatesOfStudents save(RatesOfStudents ratesOfStudents){
        return rateRepository.save(ratesOfStudents);
    }
}
