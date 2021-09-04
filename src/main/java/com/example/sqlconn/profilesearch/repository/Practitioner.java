package com.example.sqlconn.profilesearch.repository;

import com.example.sqlconn.profilesearch.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Practitioner extends JpaRepository<Patient, Long> {

    String query1 = "select * from igraffedev.practitioner p where p.id=?1";
    @Query(
            value = query1,
            nativeQuery = true
    )
    //Student getStudentByEmailAddressNative(String emailId);
    Patient getPatientById(int id);

}
