package chainOfResponsibilityANDStateANDObserver.parcelEmployee;

import chainOfResponsibilityANDStateANDObserver.counterEmployee.AbstractCounterEmployee;
import chainOfResponsibilityANDStateANDObserver.observer.EmployeeObserver;
import chainOfResponsibilityANDStateANDObserver.state.CounterEmployeeFreeState;
import chainOfResponsibilityANDStateANDObserver.state.CounterEmployeePreparingState;

import java.util.ArrayList;

public class ParcelEmployee extends EmployeeObserver {
    ArrayList<AbstractCounterEmployee> counterEmployees = new ArrayList<>();

    public ParcelEmployee(AbstractCounterEmployee counterEmployee) {
        counterEmployees.add(counterEmployee);
        counterEmployee.attach(this);

        boolean flag = true;
        AbstractCounterEmployee nextEmployee = counterEmployee.getNextEmployee();
        while (flag) {
            if (nextEmployee.getNextEmployee() == null) {
                flag = false;
            }
            counterEmployees.add(nextEmployee);
            nextEmployee.attach(this);
            nextEmployee = nextEmployee.getNextEmployee();
        }
    }

    private void handlePreparingParcel(AbstractCounterEmployee counterEmployee) {
        String parcelName = counterEmployee.getParcel().getName();
        System.out.println("Parcel employee handling \"" + parcelName + "\" parcel . . .");
        counterEmployee.setParcel(null);
        counterEmployee.setState(new CounterEmployeeFreeState());
        System.out.println("Parcel employee finished handling \"" + parcelName + "\" parcel!");
    }

    @Override
    public void update() {
        for (AbstractCounterEmployee counterEmployee : counterEmployees) {
            if (!(counterEmployee.getState() instanceof CounterEmployeePreparingState)) {
                continue;
            }
            handlePreparingParcel(counterEmployee);
        }
    }
}
