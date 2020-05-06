package cmdANDobserver.command;

import cmdANDobserver.entities.Trainee;

public class StandTrainee implements Command {
    private Trainee trainee;

    public StandTrainee(Trainee trainee){
        this.trainee = trainee;
    }

    public void execute() {
        trainee.stand();
    }
}