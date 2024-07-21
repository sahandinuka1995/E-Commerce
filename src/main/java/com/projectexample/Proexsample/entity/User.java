package com.projectexample.Proexsample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String tel;

    private String address;

    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}
