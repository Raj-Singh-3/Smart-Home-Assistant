public class LegacyFanAdapter implements Device {
    private LegacyFan legacyFan;

    public LegacyFanAdapter(LegacyFan legacyFan) {
        this.legacyFan = legacyFan;
    }

    @Override
    public void turnOn() {
        legacyFan.start();
        System.out.println("Legacy fan turned on through adapter.");
    }

    @Override
    public void turnOff() {
        legacyFan.stop();
        System.out.println("Legacy fan turned off through adapter.");
    }
}
