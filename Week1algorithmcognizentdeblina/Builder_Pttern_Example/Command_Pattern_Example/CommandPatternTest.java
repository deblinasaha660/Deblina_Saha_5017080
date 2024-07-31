package CommandPatternExample;

public class CommandPatternTest {
    public static void main(String[] args) {
        // Create the receiver
        Light livingRoomLight = new Light("Living Room");

        // Create commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);


        RemoteControl remote = new RemoteControl();


        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
