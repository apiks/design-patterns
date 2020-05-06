package demo;

import command.LayTrainee;
import command.StandTrainee;
import entities.Instructor;
import entities.Trainee;
import entities.Viewer;

public class Demo {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        Trainee trainee = new Trainee();
        Viewer viewerOne = new Viewer(trainee);
        Viewer viewerTwo = new Viewer(trainee);
        Viewer viewerThree = new Viewer(trainee);

        LayTrainee layTraineeCmd = new LayTrainee(trainee);
        StandTrainee standTraineeCmd = new StandTrainee(trainee);

        System.out.println("Using Lay Command from position: " + trainee.getPosition());
        instructor.makeCommand(layTraineeCmd);
        System.out.println("Lay Command result: " + trainee.getPosition());

        System.out.println();
        System.out.println("Using Stand Command from position: " + trainee.getPosition());
        instructor.makeCommand(standTraineeCmd);
        System.out.println("Stand Command result: " + trainee.getPosition());
    }
}
