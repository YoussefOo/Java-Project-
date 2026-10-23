import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result = 0;
        boolean validoperation = true;

        System.out.println(" This is a Calculator ");
        System.out.println("Tap you first number num1 ");
        num1 = scanner.nextDouble();

        System.out.println(" Choise you Operator");
        operator = scanner.next().charAt(0);

        System.out.println(" Tap your second number ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("We can´t devided by zero ");
                    validoperation = false;
                } else {
                    validoperation = true;
                    result = num1 / num2;
                }
            }
            default -> {
                System.out.println("Invalid Operator ");
                validoperation = false;
            }
        }
    }
}