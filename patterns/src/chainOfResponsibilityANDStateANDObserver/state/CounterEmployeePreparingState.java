package chainOfResponsibilityANDStateANDObserver.state;

import chainOfResponsibilityANDStateANDObserver.counterEmployee.AbstractCounterEmployee;

public class CounterEmployeePreparingState implements CounterEmployeeState {
    public void handleEmployeeState(AbstractCounterEmployee context) {
        context.setState(this);
    }
}