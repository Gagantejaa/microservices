package com.SOLID.emp;

public class SecurityGuard extends Employee implements Secureable {
    public SecurityGuard(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is monitoring the premises.");
    }

    @Override
    public void monitorSecurity() {
        System.out.println(name + " is ensuring security at the company.");
    }
}
