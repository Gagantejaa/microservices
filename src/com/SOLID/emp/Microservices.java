package com.SOLID.emp;

public class Microservices {
    public static void main(String[] args) {
        // Creating instances of employees
        Employee manager = new Manager("Alice", 101, 90000);
        Employee developer = new Developer("Bob", 102, 70000);
        Employee guard = new SecurityGuard("Charlie", 103, 40000);

        // Employee service to perform work
        EmployeeService employeeService = new EmployeeService();
        
        // Manager actions
        manager.displayDetails();
        employeeService.performWork(manager);
        ((Manager) manager).conductMeeting();

        System.out.println();

        // Developer actions
        developer.displayDetails();
        employeeService.performWork(developer);
        ((Developer) developer).writeCode();

        System.out.println();

        // Security Guard actions
        guard.displayDetails();
        employeeService.performWork(guard);
        ((SecurityGuard) guard).monitorSecurity();
    }
}
