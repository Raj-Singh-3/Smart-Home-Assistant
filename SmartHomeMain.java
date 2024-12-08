public class SmartHomeMain {
    public static void main(String[] args) {
        SmartHomeMediator mediator = new SmartHomeMediator();
        DeviceFactory factory = DeviceFactory.getInstance();

        Device light = factory.createDevice("light", mediator);
        Device camera = factory.createDevice("camera", mediator);
        Device alarm = factory.createDevice("alarm", mediator);
        Device fan = factory.createDevice("fan", mediator);

        light.turnOn();
        // mediator.send("turn on", light);
        camera.turnOn();
        alarm.turnOn();
        fan.turnOn();

        light.turnOff();
        camera.turnOff();
        alarm.turnOff();
        fan.turnOff();
    }
}
