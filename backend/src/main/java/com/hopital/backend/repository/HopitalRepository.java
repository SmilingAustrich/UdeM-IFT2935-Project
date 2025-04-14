package com.hopital.backend.repository;

import com.hopital.backend.model.Hopital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HopitalRepository extends JpaRepository<Hopital, Long> {
}