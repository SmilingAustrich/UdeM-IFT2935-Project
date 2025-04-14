package com.hopital.backend.controller;

import com.hopital.backend.model.Hopital;
import com.hopital.backend.repository.HopitalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hopitaux")
public class HopitalController {

    private final HopitalRepository hopitalRepository;

    public HopitalController(HopitalRepository hopitalRepository) {
        this.hopitalRepository = hopitalRepository;
    }

    @GetMapping
    public List<Hopital> getAllHopitaux() {
        return hopitalRepository.findAll();
    }
}
