package org.example.dp.behavior.commond;
/* 2
* Create concrete classes that implement the Command interface for each device.
* */
public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {

    }
}
