package chainOfResponsibilityANDStateANDObserver.state;

import chainOfResponsibilityANDStateANDObserver.counterEmployee.AbstractCounterEmployee;

public class CounterEmployeeFreeState implements CounterEmployeeState {
    public void handleEmployeeState(AbstractCounterEmployee context) {
        context.setState(this);
    }
}
