import java.util.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balence = 0;
        boolean isRunning= true;
        int choise;

        while (isRunning){

            System.out.println("*********************");
            System.out.println("The Bnaking Programme");
            System.out.println("*********************");
            System.out.println("Enter your Choise  1: Balence" );
            System.out.println("Enter your Choise  2: Deposite");
            System.out.println("Enter your Choise  2: Deposite,");
            System.out.println("Enter your Choise  3: Withthrow ");
            System.out.println("Enter your Choise  4:Exit");
            System.out.println("*********************");


            choise = scanner.nextInt();

            switch(choise){
                case 1 -> showBalence(balence);
                case 2 -> balence += deposit() ;
                case 3 -> balence -= withdraw(balence) ;
                case 4 -> isRunning = false  ;
                default -> System.out.println("invalid Choise");

            }

        }
        System.out.println("End of the Game ");

    }
    static void showBalence ( double balence){
        System.out.println("*********************");
        System.out.printf("$%.3f\n", balence);
    }

    static double deposit(){
        double amount;
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can´t be Negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw (double balence){

        double amount;
        System.out.println("Enter amount eithdray");
        amount = scanner.nextDouble();

        if(amount > balence){
            System.out.println(" Insuffesant ");
            return 0;
        } else if (amount < 0) {
            System.out.println("Can`t be Negative ");
            return 0;
        }
        else {
            return amount;
        }

    }


}