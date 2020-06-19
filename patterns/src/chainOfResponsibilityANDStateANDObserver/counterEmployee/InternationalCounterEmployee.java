package chainOfResponsibilityANDStateANDObserver.counterEmployee;

import chainOfResponsibilityANDStateANDObserver.parcel.Parcel;
import chainOfResponsibilityANDStateANDObserver.state.CounterEmployeeFreeState;
import chainOfResponsibilityANDStateANDObserver.state.CounterEmployeePreparingState;

public class InternationalCounterEmployee extends AbstractCounterEmployee {
    public InternationalCounterEmployee(int scope) {
        this.scope = scope;
        this.setState(new CounterEmployeeFreeState());
    }

    @Override
    protected void prepareParcel(Parcel parcel) {
        System.out.println("International: " + parcel.getName());
        this.setParcel(parcel);
        this.setState(new CounterEmployeePreparingState());
    }
}