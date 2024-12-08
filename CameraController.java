public class CameraController implements Device {
    public void openCamera() {
        try {
            Runtime.getRuntime().exec("cmd /c start microsoft.windows.camera:");
            System.out.println("Camera opened.");
        } catch (Exception e) {
            System.out.println("Error opening camera: " + e.getMessage());
        }
    }

    public void closeCamera() {
        try {
            Runtime.getRuntime().exec("taskkill /IM WindowsCamera.exe /F");
            System.out.println("Camera closed.");
        } catch (Exception e) {
            System.out.println("Error closing camera: " + e.getMessage());
        }
    }

    @Override
    public void turnOn() {
        openCamera();
    }

    @Override
    public void turnOff() {
        closeCamera();
    }
}
