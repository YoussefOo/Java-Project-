import java.util.*;
public class shopcart {
    public  static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        double qauntitiy;
        char currency = '$';
        double total ;

        System.out.println("Enter you choise :");
        item = scanner.nextLine();

        System.out.println("The price of your choise is ");
        price = scanner.nextInt();

        System.out.println("Enter how much you need ");
        qauntitiy = scanner.nextInt();

        total = price  * qauntitiy;
        System.out.println("the Total price of " + item + " is " + total + currency );

        scanner.close();

    }
}
