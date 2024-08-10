package org.example.dp.behavior.commond;

public class lOnOffApp {

    /* 4
    * To use the remote control, create instances of the concrete command classes and add them to the remote control. Then call the execute() method on the commands to perform the corresponding actions on the devices.

Light light = new Light();
Fan fan = new Fan();

RemoteControl remoteControl = new RemoteControl();
remoteControl.addCommand(new LightOnCommand(light));
remoteControl.addCommand(new FanOffCommand(fan));

// Turn on the light
remoteControl.getCommands().get(0).execute();

// Turn off the fan
remoteControl.getCommands().get(1).execute();
By using the Command Design Pattern, the remote control application is flexible enough to add new devices in the future without changing the existing code. To add a new device, you only need to create a new concrete command class that implements the Command interface and add it to the remote control using the addCommand() method.
    * */
}
