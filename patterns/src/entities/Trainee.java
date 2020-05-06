package entities;

import observer.TraineeObserver;

import java.util.ArrayList;
import java.util.List;

public class Trainee {
    private String position = "standing";
    private List<TraineeObserver> observers = new ArrayList<>();

    public void lay() {
        this.setPosition("laying");
    }
    public void stand() {
        this.setPosition("standing");
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
        notifyAllObservers();
    }

    public void attach(TraineeObserver observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (TraineeObserver observer : observers) {
            observer.update();
        }
    }
}
