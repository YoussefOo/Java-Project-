import java.util.*;
public class nestedifStat {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean Student = true ;
        boolean Senior = false;
        double price = 9.9;

        if(Student){
            if(Senior){
                System.out.println(" You are a Senio and you have a discount of 20%");
                System.out.println(" You are a Student and you have a discount  of 10% ");
                price *= 0.7;
                System.out.println(" the price is $" + price);
            }
            else{

                System.out.println("You are only a Student an you have a discount of 10% ");
                price *= 0.9;
                System.out.println(" the price is $" + price);
        }

        }
        else {
            if (Senior) {
                System.out.println("You are a Senior and you have a discount of 20% ");
                price *= 0.8;
                System.out.println(" the price is $" + price);

            }
            else {
                System.out.println(" You are not a Student and Senior ");
                price *=1;
                System.out.println(" the price is $" + price);
            }
        }



        scanner.close();
    }
}
