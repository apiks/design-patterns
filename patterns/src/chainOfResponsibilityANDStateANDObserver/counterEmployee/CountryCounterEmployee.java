package chainOfResponsibilityANDStateANDObserver.counterEmployee;

import chainOfResponsibilityANDStateANDObserver.parcel.Parcel;
import chainOfResponsibilityANDStateANDObserver.state.CounterEmployeeFreeState;
import chainOfResponsibilityANDStateANDObserver.state.CounterEmployeePreparingState;

public class CountryCounterEmployee extends AbstractCounterEmployee {
    public CountryCounterEmployee(int scope) {
        this.scope = scope;
        this.setState(new CounterEmployeeFreeState());
    }

    @Override
    protected void prepareParcel(Parcel parcel) {
        System.out.println("Country: " + parcel.getName());
        this.setParcel(parcel);
        this.setState(new CounterEmployeePreparingState());
    }
}