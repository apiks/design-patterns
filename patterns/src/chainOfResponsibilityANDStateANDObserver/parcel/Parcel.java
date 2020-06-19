package chainOfResponsibilityANDStateANDObserver.parcel;

public class Parcel {
    protected String name;

    public Parcel(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
