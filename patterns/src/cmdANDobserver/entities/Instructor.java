package cmdANDobserver.entities;

import cmdANDobserver.command.Command;

public class Instructor {
    public void makeCommand(Command command){
        command.execute();
    }
}
