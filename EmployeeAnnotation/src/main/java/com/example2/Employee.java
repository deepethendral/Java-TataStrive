package com.example2;

import org.springframework.stereotype.Component;

@Component("employee")  // 👈 This makes it a Spring-managed bean with name "employee"
public class Employee {
    private int Emp_id;
    private String Emp_name;
    private String Emp_role;

    public void setEmp_id(int emp_id) {
        this.Emp_id = emp_id;
    }
    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.Emp_name = emp_name;
    }
    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_role(String emp_role) {
        this.Emp_role = emp_role;
    }
    public String getEmp_role() {
        return Emp_role;
    }
}
