package com.example.sqlconn.profilesearch.controller;

import com.example.sqlconn.profilesearch.entity.Patient;
import com.example.sqlconn.profilesearch.repository.Practitioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class Controller {

    @Autowired
    Practitioner practitioner;

    @GetMapping("/getdetails/{id}")
    public Patient registerDoc(
            @PathVariable("id") int idval
    ) {
        Patient patient = practitioner.getPatientById(idval);
        return patient;
    }
}
