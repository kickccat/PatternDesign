package service;

import model.GumballMachine;

public class SoldOutState implements State {

    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Gumball is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter inserted");
    }

    @Override
    public void turnCrank() {
        System.out.println("Machine is closed");
    }

    @Override
    public void dispense() {
        System.out.println("Empty, no gumball");
    }
}
