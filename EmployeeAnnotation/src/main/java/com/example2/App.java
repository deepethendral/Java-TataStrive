package com.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 👇 This must match the name in @Component("employee")
        Employee emp = (Employee) context.getBean("employee");

        emp.setEmp_id(5022);
        emp.setEmp_name("thendral");
        emp.setEmp_role("junior full stack java");

        System.out.println("The Employee ID is: " + emp.getEmp_id());
        System.out.println("The Employee Name is: " + emp.getEmp_name());
        System.out.println("The Employee Role is: " + emp.getEmp_role());
    }
}
