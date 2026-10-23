import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius, circum, area, volum;

        System.out.println("Enter the radius in cm ");
        radius = scanner.nextDouble();

        circum = 2 * Math.PI * radius;
        System.out.println("The circum is " +circum);


        area = Math.PI * Math.pow(radius,2);
        System.out.println(" the Area is " + area);

        volum = 4/3 + Math.PI * Math.pow(radius,3);
        System.out.println("the volume is " + volum);

        scanner.close();
    }
}