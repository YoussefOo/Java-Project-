import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] questions = {"1. What does CPU stand for?",
                "2. Which language is mainly used to structure web pages?",
                "3. What does RAM stand for?",
                "4. Which of these is an operating system?",
                "5. What is the main purpose of a firewall?"};

        String [][] options = {{"1. Central Process Unit", "2. Central Processing Unit", "3. Computer Personal Unit", "4. Central Program Utility"},
                {"1. HTML", "2. Python","3. SQL","4. C++"},
                {"1. Read Access Memory","2. Run All Memory","3. Random Access Memory","4. Remote Application Module"},
                {"1. Google Chrome", "2. Microsoft Word", "3. Linux", "4. Adobe Photoshop"},
                {"1. To cool down a computer", "2. To protect a network from unauthorized access","3. To increase screen brightness", "4. To store files permanently"}};

        int[] answer = {2,1,3,3,2};
        int score = 0;
        int guess;

        System.out.println("**********************");
        System.out.println("Welcome to Guess Game ");
        System.out.println("**********************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.println("Enter Your Guess : ");
            guess = scanner.nextInt();

            if(guess == answer[i]){
                System.out.println("*******");
                System.out.println("Correct");
                System.out.println("*******");
                score++;

            }
            else {
                System.out.println("******");
                System.out.println("Wroong");
                System.out.println("******");

            }

        }
        System.out.println("The Score is "+ score + " Out of " + questions.length);
        scanner.close();

    }
}