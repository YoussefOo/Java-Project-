import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mad lipes Game
        Scanner scanner = new Scanner(System.in);

        String adjective1, noun, adjectiv2, verb , adjective3;

        System.out.println("enter an adjectiv (descreption) :");
        adjective1 = scanner.nextLine();

        System.out.println("enter a noun  (animal or person ) : ");
        noun = scanner.nextLine();

        System.out.println("enter an adjectiv (descreption) :     🐯");
        adjectiv2 = scanner.nextLine();

        System.out.println("enter a verb  (action ) : ");
        verb = scanner.nextLine();

        System.out.println("enter an adjectiv (descreption) :");
        adjective3 = scanner.nextLine();

        scanner.close();

    }
}