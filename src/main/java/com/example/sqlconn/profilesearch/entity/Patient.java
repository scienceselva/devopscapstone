package com.example.sqlconn.profilesearch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "practitioner")
public class Patient {

    @Id
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    int age;

    @Column(name = "gender")
    String gender;

    @Column(name = "phonenumber")
    int phonenumber;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @Column(name = "address")
    String address;

    @Column(name = "occupation")
    String occupation;

    @Column(name = "photo")
    String photo;

    @Column(name = "signature")
    String signature;

    @Column(name = "status")
    String status;

}
