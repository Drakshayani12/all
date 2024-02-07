package com.example.user.entity;
import java.util.*;

public class User{
    private Integer id;
    private String name;
    private Date dob;
    public User(int id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getDob() {
        return dob;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
    }


    
}