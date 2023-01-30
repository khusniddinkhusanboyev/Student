package com.example.student.service;

import com.example.student.model.Detail;
import com.example.student.repository.Detailrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {

    @Autowired
    private final Detailrepository detailrepository;

    public DetailService(Detailrepository detailrepository) {
        this.detailrepository = detailrepository;
    }

    public Detail save(Detail detail){
        return detailrepository.save(detail);
    }

    public List<Detail> saveAll(Iterable<Detail> details){
        return detailrepository.saveAll(details);
    }
}
