package chainOfResponsibilityANDStateANDObserver.observer;

import chainOfResponsibilityANDStateANDObserver.counterEmployee.AbstractCounterEmployee;

import java.util.ArrayList;

public abstract class EmployeeObserver {
    protected ArrayList<AbstractCounterEmployee> counterEmployees;
    public abstract void update();
}