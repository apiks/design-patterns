package chainOfResponsibilityANDStateANDObserver.counterEmployee;

import chainOfResponsibilityANDStateANDObserver.parcel.Parcel;
import chainOfResponsibilityANDStateANDObserver.state.CounterEmployeeFreeState;
import chainOfResponsibilityANDStateANDObserver.state.CounterEmployeePreparingState;

public class CityCounterEmployee extends AbstractCounterEmployee {
    public CityCounterEmployee(int scope) {
        this.scope = scope;
        this.setState(new CounterEmployeeFreeState());
    }

    @Override
    protected void prepareParcel(Parcel parcel) {
        System.out.println("City: " + parcel.getName());
        System.out.println("Address: " + parcel.getAddress());
        this.setParcel(parcel);
        this.setState(new CounterEmployeePreparingState());
    }
}