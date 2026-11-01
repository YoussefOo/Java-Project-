import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\admin\\Desktop\\Java-Project-\\Audio_player\\src\\Naruto-Shippuden.wav";
        File file = new File(filepath);

        try(AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
                Scanner scanner = new Scanner(System.in)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
            String responce = "";
            while(!responce.equals("Q")){
                System.out.println("P: Play, S: Stop, R: Reset, Q: Quit ");
                System.out.print("Enter your Choice ");
                responce = scanner.next().toUpperCase();

                switch (responce){
                    case "P"-> clip.start();
                    case "R"-> clip.setMicrosecondPosition(0);
                    case "S"-> clip.stop();
                    case "Q"-> clip .close();
                    default -> System.out.println("Invalid Choice");

                }
            }

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio File isn´t Supported");;
        } catch (IOException e) {
            System.out.println("Something is Wrong");
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }
}