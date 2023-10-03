package com.sai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sai.entity.SSN;

public interface SSNRepository extends JpaRepository<SSN, Integer> {

    // Find a record by SSN number and return it as an SSN object
    SSN findBySsnNumber(Long ssnNumber);

    // Check if a record with a given SSN number exists
    boolean existsBySsnNumber(Long ssnNumber);
}
