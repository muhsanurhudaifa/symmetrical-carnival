package com.example.crud.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Profile")
public class Profile {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private Date birthday;
    private String email;
    private String city;
    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }
    
    public Date getBirthday(){
        return birthday;
    }

    public Date setBirthday(Date birthday) {
        return this.birthday = birthday;
    }
    
    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCity(){
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCountry(){
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
