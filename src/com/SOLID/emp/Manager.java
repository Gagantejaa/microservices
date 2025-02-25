package com.SOLID.emp;

public class Manager extends Employee implements Manageable {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team.");
    }

    @Override
    public void conductMeeting() {
        System.out.println(name + " is conducting a team meeting.");
    }
}
