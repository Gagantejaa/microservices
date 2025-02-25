package com.SOLID.emp;

public class Developer extends Employee implements Codeable {
    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code.");
    }

    @Override
    public void writeCode() {
        System.out.println(name + " is developing a software module.");
    }
}
