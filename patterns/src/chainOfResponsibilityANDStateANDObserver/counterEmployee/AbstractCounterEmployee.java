package chainOfResponsibilityANDStateANDObserver.counterEmployee;

import chainOfResponsibilityANDStateANDObserver.observer.EmployeeObserver;
import chainOfResponsibilityANDStateANDObserver.parcel.Parcel;
import chainOfResponsibilityANDStateANDObserver.state.CounterEmployeeState;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCounterEmployee {
    public static int INTERNATIONAL = 1;
    public static int COUNTRY = 2;
    public static int CITY = 3;

    protected int scope;
    protected AbstractCounterEmployee nextEmployee;

    private Parcel parcel;
    private CounterEmployeeState state;
    private List<EmployeeObserver> observers = new ArrayList<>();

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    public Parcel getParcel() {
        return this.parcel;
    }

    public void setState(CounterEmployeeState state){
        this.state = state;
        notifyAllObservers();
    }

    public CounterEmployeeState getState(){
        return state;
    }

    public void setNextEmployee(AbstractCounterEmployee nextEmployee) {
        this.nextEmployee = nextEmployee;
    }

    public AbstractCounterEmployee getNextEmployee() {
        if (this.nextEmployee != null) {
            return this.nextEmployee;
        }
        return null;
    }

    public void handleParcel(int scope, Parcel parcel) {
        if(this.scope == scope) {
            prepareParcel(parcel);
        } else if (nextEmployee != null) {
            nextEmployee.handleParcel(scope, parcel);
        }
    }

    public void attach(EmployeeObserver observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (EmployeeObserver observer : observers) {
            observer.update();
        }
    }

    abstract protected void prepareParcel(Parcel parcel);
}