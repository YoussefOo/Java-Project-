import javax.sound.midi.Soundbank;
import java.util.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess ;
        int min = 1;
        int max = 100;
        int attemps = 0 ;
        int randNum = random.nextInt(min,max+1);

        System.out.println("This is a Guess Num game");


        do{
            System.out.printf(" Please guess a number %d %d ",min,max);
            guess = scanner.nextInt();
            attemps++;

            if(guess > randNum){
                System.out.println("Too Heigh ! Try again Please ");
                attemps++;
            } else if (guess < randNum) {
                System.out.println("Too Low try again Please ");
                attemps++;

            }
            else {
                System.out.println("Correct the number was correct  " + randNum);

            }

        }while(guess != randNum);
//        Thread.sleep(1000);


        scanner.close();

    }
}