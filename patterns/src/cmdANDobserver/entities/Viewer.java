package cmdANDobserver.entities;

import cmdANDobserver.observer.TraineeObserver;

public class Viewer extends TraineeObserver {
    private String position = "standing";

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public Viewer(Trainee trainee){
        this.trainee = trainee;
        this.trainee.attach(this);
    }

    @Override
    public void update() {
        this.setPosition(trainee.getPosition());
        System.out.println( "Viewer position update: " + this.getPosition());
    }
}
