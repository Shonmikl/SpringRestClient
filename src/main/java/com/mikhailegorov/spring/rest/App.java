package com.mikhailegorov.spring.rest;

import com.mikhailegorov.spring.rest.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
//        Employee emp = communication.getEmployee(1);
//        System.out.println(emp);

//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1500);
//        employee.setId(10);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(10);
    }
}