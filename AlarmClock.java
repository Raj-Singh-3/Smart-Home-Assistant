import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AlarmClock implements Device {
    private String filePath = "alarm.wav";

    @Override
    public void turnOn() {
        playSound();
    }

    @Override
    public void turnOff() {
        System.out.println("Alarm stopped.");
    }

    public void playSound() {
        try {
            File soundFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            clip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    clip.close();
                }
            });

            while (clip.isRunning()) {
                Thread.sleep(100);
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
