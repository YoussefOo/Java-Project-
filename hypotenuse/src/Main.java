import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a,b,c;
        System.out.print("Enter the height A in cm :");
        a = scanner.nextDouble();
        System.out.print("Enter your height B in cm :");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.printf("Your hypotenuse is %.3f cm%n", c);

        scanner.close();

    }
}