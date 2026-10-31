import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String [] row;


        System.out.println("*******************");
        System.out.println("Welcome to new Game");
        System.out.println(" Symbols : 🍒 🍉 🍋‍ 🔔 ⭐");
        System.out.println("*******************");

        while (balance > 0){
            System.out.println("Your Current Balance : " + balance);
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet > balance){
                System.out.println("Insufficient Funds ");
                continue;
            } else if (bet < 0) {
                System.out.println(" Bet must be greater than 0 ");
                continue;
            }
            else {
                balance -= bet;
            }

            System.out.println("Spinning ......! ");

            row = spinRow();
            printrow(row);



        }
        
    }

    public static Scanner getScanner() {
        return scanner;
    }

    static String[] spinRow(){
        String [] symbols = {"🍒","🍉","🍋","🔔" ,"⭐"};
        String [] row = new  String[3];
        for (int i= 0; i < symbols.length; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
            return row;
        }

    }

    static void printrow (String [] row ){
        System.out.println(" " + String.join(" | ", row) );
    }
    static int getpayout(String [] row , int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2]) ){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case
            }
        }

    }
}


