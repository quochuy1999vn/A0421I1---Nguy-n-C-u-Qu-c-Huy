package com.casestudy.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;

    @NotBlank(message = "Không được để trống")
    private String employee_name;

    @NotBlank(message = "Không được để trống")
    private String employee_birthday;

    @Pattern(regexp = "(([0-9]{9})\\b)", message = "Sai định dạng")
    private String employee_id_card;

    @NotNull(message = "Không được để trống")
    private double employee_salary;

    @Pattern(regexp = "((090|091)+([0-9]{7})\\b)", message = "Sai định dạng")
    private String employee_phone;

    @NotNull
    @Email
    private String employee_email;

    @NotBlank(message = "Không được để trống")
    private String employee_address;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position_id;

    @ManyToOne
    @JoinColumn(name = "education_degree_id")
    private Education_degree education_degree_id;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division_id;

    @ManyToOne
    @JoinColumn(name = "username")
    private User username;


    public Employee() {
    }

    public Employee(int employee_id, String employee_name, String employee_birthday, String employee_id_card, double employee_salary, String employee_phone, String employee_email, String employee_address) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_birthday = employee_birthday;
        this.employee_id_card = employee_id_card;
        this.employee_salary = employee_salary;
        this.employee_phone = employee_phone;
        this.employee_email = employee_email;
        this.employee_address = employee_address;
    }


    public Position getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Position position_id) {
        this.position_id = position_id;
    }

    public Education_degree getEducation_degree_id() {
        return education_degree_id;
    }

    public void setEducation_degree_id(Education_degree education_degree_id) {
        this.education_degree_id = education_degree_id;
    }

    public Division getDivision_id() {
        return division_id;
    }

    public void setDivision_id(Division division_id) {
        this.division_id = division_id;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(String employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public String getEmployee_id_card() {
        return employee_id_card;
    }

    public void setEmployee_id_card(String employee_id_card) {
        this.employee_id_card = employee_id_card;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }
}
