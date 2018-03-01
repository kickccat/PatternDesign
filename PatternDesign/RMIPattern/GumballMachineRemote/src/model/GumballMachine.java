package model;

import service.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private String location;
    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        this.location = location;
        this.count = numberGumballs;
    }

    public GumballMachine(int numberGumballs) throws RemoteException {
        super();
        this.count = numberGumballs;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if (this.count > 0) {
            state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count -= 1;
        }
    }

    @Override
    public String toString() {
        System.out.println();
        System.out.println("Gumball machine Inc.");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Gumball machine model #2018\n");
        stringBuffer.append("Inventory: " + getCount() + " gumballs\n");
        if (getCount() == 0) {
            stringBuffer.append("Out of service\n");
        } else {
            stringBuffer.append("Machine is waiting for quarter\n");
        }
        return stringBuffer.toString();
    }

    public void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }
}
