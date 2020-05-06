package observer;

import entities.Trainee;

public abstract class TraineeObserver {
    protected Trainee trainee;
    public abstract void update();
}