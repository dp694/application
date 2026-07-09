package com.goldsgym.application.repository;

import com.goldsgym.application.model.LeadRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends JpaRepository<LeadRecord,Long> {
}
