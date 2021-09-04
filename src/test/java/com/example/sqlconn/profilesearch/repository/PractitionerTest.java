package com.example.sqlconn.profilesearch.repository;

import com.example.sqlconn.profilesearch.entity.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PractitionerTest {
    @Autowired
    Practitioner practitioner;
    
    @Test
    public void getPatientById() {
        Patient patient = practitioner.getPatientById(1);
        System.out.println("patient = " + patient);
    }
}