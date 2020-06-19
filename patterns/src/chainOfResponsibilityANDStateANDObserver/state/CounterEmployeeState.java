package chainOfResponsibilityANDStateANDObserver.state;

import chainOfResponsibilityANDStateANDObserver.counterEmployee.AbstractCounterEmployee;

public interface CounterEmployeeState {
    public void handleEmployeeState(AbstractCounterEmployee context);
}
