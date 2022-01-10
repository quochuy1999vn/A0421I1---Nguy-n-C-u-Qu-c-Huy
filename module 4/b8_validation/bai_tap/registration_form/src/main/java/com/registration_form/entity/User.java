package com.registration_form.entity;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 45)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 45)
    private String lastName;

    @Min(18)
    private Integer age;

    @NumberFormat(pattern = "/((09|03|07|08|05)+([0-9]{8})\\b)/g")
    private Integer phoneNumber;

    @Email
    private String email;

    public User() {
    }

    public User(Long id, String firstName, String lastName, Integer age, Integer phongNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phongNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPhongNumber() {
        return phoneNumber;
    }

    public void setPhongNumber(Integer phongNumber) {
        this.phoneNumber = phongNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
