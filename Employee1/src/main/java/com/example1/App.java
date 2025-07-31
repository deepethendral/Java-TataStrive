package com.example1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee emp = (Employee) context.getBean("employee");

        System.out.println("The Employee ID is: " + emp.getEmp_id());
        System.out.println("The Employee Name is: " + emp.getEmp_name());
        System.out.println("The Employee Role is: " + emp.getEmp_role());
    }
}
