public class SmartHomeMediator implements Mediator {
    private Light light;
    private CameraController cameraController;
    private AlarmClock alarmClock;
    private LegacyFanAdapter fanAdapter;

    public void registerLight(Light light) {
        this.light = light;
    }

    public void registerCameraController(CameraController cameraController) {
        this.cameraController = cameraController;
    }

    public void registerAlarmClock(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    public void registerFan(LegacyFanAdapter fanAdapter) {
        this.fanAdapter = fanAdapter;
    }

    @Override
    public void send(String message, Device device) {
        if (device == light) {
            if (message.equalsIgnoreCase("turn on")) light.turnOn();
            else if (message.equalsIgnoreCase("turn off")) light.turnOff();
        } else if (device == cameraController) {
            if (message.equalsIgnoreCase("turn on")) cameraController.openCamera();
            else if (message.equalsIgnoreCase("turn off")) cameraController.closeCamera();
        } else if (device == alarmClock) {
            if (message.equalsIgnoreCase("turn on")) alarmClock.turnOn();
            else if (message.equalsIgnoreCase("turn off")) alarmClock.turnOff();
        } else if (device == fanAdapter) {
            if (message.equalsIgnoreCase("turn on")) fanAdapter.turnOn();
            else if (message.equalsIgnoreCase("turn off")) fanAdapter.turnOff();
        }
    }
}
