import  java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp0 ;
        double newTemp;
        String unit;

        System.out.println(" This is a Temp Converter ");
        System.out.print(" Enter Your Temp ");
        temp0 = scanner.nextDouble();
        System.out.print("Do you Want convert your Temp to F or C ? :  ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp0-32)+ 5/9 : (temp0*9/5)+32;
        System.out.println(" The Temp is in "  +  newTemp + unit);



        scanner.close();
    }
}