public class DeviceFactory {

    private static DeviceFactory instance;

    private DeviceFactory() {}

    public synchronized static DeviceFactory getInstance() {
        if (instance == null) {
            instance = new DeviceFactory();
        }
        return instance;
    }

    public Device createDevice(String type, Mediator mediator) {
        switch (type.toLowerCase()) {
            case "light":
                Light light = new Light(mediator);
                mediator.registerLight(light);
                return light;
            case "camera":
                CameraController cameraController = new CameraController();
                mediator.registerCameraController(cameraController);
                return cameraController;
            case "alarm":
                AlarmClock alarmClock = new AlarmClock();
                mediator.registerAlarmClock(alarmClock);
                return alarmClock;
            case "fan":
                LegacyFan legacyFan = new LegacyFan();
                LegacyFanAdapter fanAdapter = new LegacyFanAdapter(legacyFan);
                mediator.registerFan(fanAdapter);
                return fanAdapter;
            default:
                throw new IllegalArgumentException("Unknown device type");
        }
    }
}
