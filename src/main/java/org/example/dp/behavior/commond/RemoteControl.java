package org.example.dp.behavior.commond;

import java.util.ArrayList;
import java.util.List;

/*3 Define a class called RemoteControl that has a list of commands and methods to add or remove commands.
* */
public class RemoteControl {
    private List<Command> commands;

    public RemoteControl() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }
}