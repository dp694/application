package com.goldsgym.application.controller;

import com.goldsgym.application.model.LeadRecord;
import com.goldsgym.application.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/leads")
@CrossOrigin(origins = "*")  // Allows your hosted frontend to connect without CORS errors
public class LeadController {

    @Autowired
    private LeadRepository leadRepository;

    @PostMapping("/capture")
    public ResponseEntity<?> captureLead(@RequestBody LeadRecord lead){
        LeadRecord saved = leadRepository.save(lead);
        return ResponseEntity.ok(Map.of("status", "SUCCESS", "id", saved.getId()));
    }

}
