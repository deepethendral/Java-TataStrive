package com.example1;


import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int Emp_id;
    private String Emp_name;
    private String Emp_role;

    public void setEmp_id(int Emp_id) {
        this.Emp_id = Emp_id;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_name(String Emp_name) {
        this.Emp_name = Emp_name;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_role(String Emp_role) {
        this.Emp_role = Emp_role;
    }

    public String getEmp_role() {
        return Emp_role;
    }
}
