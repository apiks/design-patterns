package chainOfResponsibilityANDStateANDObserver.parcel;

public class Parcel {
    protected String name;
    protected String address;

    public Parcel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }
}
