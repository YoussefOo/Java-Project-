import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        int total = 0 ;
        int numofDice;

        System.out.println("This is a Dice Roller G ame ");
        System.out.print("Enter the number of Dice to roll : ");
        numofDice = scanner.nextInt();


        if(numofDice > 0){
            for (int i=0; i < numofDice; i++){
                int roll = random.nextInt(1,7);
                printDice(roll);
                total += roll;

            }
            System.out.println("The Total is "+ total);
        }
        else {
            System.out.println("# must be greater than 0 ");
        }
        Scanner scanner1 = scanner;
        scanner1.close();

    }
    static void  printDice(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●      |
                |        |
                |      ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");

        }
    }
}
