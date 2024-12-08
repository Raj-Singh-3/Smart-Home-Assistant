public class Light implements Device {
    private Mediator mediator;

    public Light(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void turnOn() {
        System.out.println("Light turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light turned off.");
    }
}
