import java.util.*;

public class practiceMethods {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first parameters a ");
        double  a = scanner.nextDouble();
        System.out.println("Enter your second parameters b");
        double b = scanner.nextDouble();

        System.out.println("The area is "+ area(a,b));


    }

    static double area(double a, double b){
        return a*b;
    }
}

