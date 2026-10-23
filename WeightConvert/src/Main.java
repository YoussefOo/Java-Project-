import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choise;

        System.out.println("This is a Wieght Converter Programm");
        System.out.println("If you want to convert Lbs to Kg tap 1 ");
        System.out.println("If you want to convert Kg to lbs tap 2 ");

        choise = scanner.nextInt();

        if(choise == 1 ){
            System.out.print("Enter you Weight in Lbs ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("Your weight in Kg "+ newWeight);
        }
        else if (choise ==2) {
            System.out.print("Enter you Weight in Kg: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("Your weight in Lbs: " +
                    ""+ newWeight);
        }
        else {
            System.out.println("Plaese chose a choise ");
        }


        scanner.close();
    }
}