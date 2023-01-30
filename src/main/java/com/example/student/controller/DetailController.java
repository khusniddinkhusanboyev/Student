package com.example.student.controller;

import com.example.student.model.Detail;
import com.example.student.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    private final DetailService detailService;

    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }

    @GetMapping("/info")
    public ResponseEntity getAll(){
        ArrayList<Detail> details=new ArrayList<>();
        details.add(new Detail(1L,"Andijon region, Baliqchi district , Eskixaqqulobod qfy , yangixayot mfy manaviyat-10","erkak"));
        details.add(new Detail(2L,"Farg'ona region, Uchko'pirik district , Qirg'iz qfy , bobue mfy manaviyat-10","femail"));

        return ResponseEntity.ok(detailService.saveAll(details));

    }
}
