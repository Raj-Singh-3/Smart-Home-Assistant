public interface Mediator {
    void send(String message, Device device);
    void registerLight(Light light);
    void registerCameraController(CameraController cameraController);
    void registerAlarmClock(AlarmClock alarmClock);
    void registerFan(LegacyFanAdapter fanAdapter);
}
