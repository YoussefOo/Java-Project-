import javax.net.ssl.SNIHostName;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\admin\\Desktop\\Java-Project-\\Hangman-Game\\src\\words.txt";
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Character> wordState = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader( new FileReader(filepath))) {
            String line;
            while ((line=reader.readLine())!= null){
                words.add(line.trim());
            }


        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }
         catch (IOException e) {
             System.out.println("Something is wrong ");
        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        int wrongGeuss = 0;
        for( int i = 0; i < word.length(); i++){
            wordState.add('_');
        }
        System.out.println("***********************");
        System.out.println("Welcome to Hangman Game");
        System.out.println("***********************");

        while(wrongGeuss < 6){
            System.out.println(gethangmanArt(wrongGeuss));
            System.out.println("word : ");
            for(char c : wordState){
                System.out.print(c +" ");
            }
            System.out.println();
            System.out.print("Geuss a letter : ");
            char guess = scanner.next().charAt(0);
            if(word.indexOf(guess) >= 0){
                System.out.println("Correct ");
            }
            if(!wordState.contains('_')){
                System.out.println(gethangmanArt(wrongGeuss));
                System.out.println("You Wine");
                System.out.println("The word was "+word );
                break;
            }
            else {
                wrongGeuss++;
                System.out.println("Wrong Geuss ");
            }
        }
        if(wrongGeuss >= 6){
            System.out.println(gethangmanArt(wrongGeuss));
            System.out.println("Game Over");
            System.out.println("The Word was "+ word);

        }

    }
    static String gethangmanArt ( int wrongGeuss){
        return switch (wrongGeuss){
            case 0 -> """
                    
                    
                    """;
            case 1 -> """
                      o  
                                        
                    """;
            case 2 -> """
                      o
                     /   
                    """;
            case 3 -> """
                      o
                     /| 
                    
                    """;
            case 4 -> """
                      o
                     /|\\
                     """;
            case 5 -> """
                      o
                     /|\\
                     / 
                    """;
            case 6 -> """
                      o
                     /|\\
                     / \\
                    """;
            default -> "";
        };
    }
}