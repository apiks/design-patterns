package chainOfResponsibilityANDStateANDObserver.demo;

import chainOfResponsibilityANDStateANDObserver.counterEmployee.AbstractCounterEmployee;
import chainOfResponsibilityANDStateANDObserver.counterEmployee.InternationalCounterEmployee;
import chainOfResponsibilityANDStateANDObserver.counterEmployee.CountryCounterEmployee;
import chainOfResponsibilityANDStateANDObserver.counterEmployee.CityCounterEmployee;
import chainOfResponsibilityANDStateANDObserver.parcel.Parcel;
import chainOfResponsibilityANDStateANDObserver.parcelEmployee.ParcelEmployee;

public class Demo {
    private static AbstractCounterEmployee getChainOfEmployees() {
        // Create Employees according to their scope
        AbstractCounterEmployee internationalEmployee = new InternationalCounterEmployee(AbstractCounterEmployee.INTERNATIONAL);
        AbstractCounterEmployee countryEmployee = new CountryCounterEmployee(AbstractCounterEmployee.COUNTRY);
        AbstractCounterEmployee cityEmployee = new CityCounterEmployee(AbstractCounterEmployee.CITY);

        // Set up the chain order
        internationalEmployee.setNextEmployee(countryEmployee);
        countryEmployee.setNextEmployee(cityEmployee);

        return internationalEmployee;
    }

    public static void main(String[] args) {
        AbstractCounterEmployee employeesChain = getChainOfEmployees();
        ParcelEmployee parcelEmployee = new ParcelEmployee(employeesChain);

        System.out.println("-----");
        employeesChain.handleParcel(AbstractCounterEmployee.INTERNATIONAL, new Parcel("Book", "France, Paris, st. 25th Molyneux Avenue"));
        System.out.println("-----");
        employeesChain.handleParcel(AbstractCounterEmployee.COUNTRY, new Parcel("Memory Stick", "Bulgaria, Sofia, st. Kapitan Raicho 6a"));
        System.out.println("-----");
        employeesChain.handleParcel(AbstractCounterEmployee.CITY, new Parcel("Flash Drive", "Bulgaria, Plovdiv, bul. Bulgaria 236"));
        System.out.println("-----");
    }
}
