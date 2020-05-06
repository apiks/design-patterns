package command;

import entities.Trainee;

public class LayTrainee implements Command {
    private Trainee trainee;

    public LayTrainee(Trainee trainee){
        this.trainee = trainee;
    }
    public void execute() {
        trainee.lay();
    }
}