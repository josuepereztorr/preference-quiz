package edu.wctc;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {

    // reads user input
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean runQuiz = true;

        // run the quiz() method until runQuiz is false
        do {
            // run the quiz at least once
            quiz();

            // ask the user if they want to run the quiz again
            System.out.println("Again? Enter 1 to play again, or any other key to exit");

            // check user input
            if (!scanner.nextLine().equals("1"))
                runQuiz = false;

        } while (runQuiz);
    }

    static void quiz() {
        // player score
        int score = 0;

        // holds all the user preference possibilities
        String[][] wordBank = {{"mild","tea","breakfast","summer","paper"},{"spicy","coffee","brunch","winter","plastic"}};

        // welcome the user
        System.out.println("Welcome to the Preference Quiz!\n" + "-".repeat(31));

        for (int i = 0; i < wordBank[0].length; i++) {
            // prompt the user for a choice
            System.out.println(MessageFormat.format("Do you prefer {0} or {1}", wordBank[0][i], wordBank[1][i]));
            System.out.println("Enter 0 for the preference on the left");
            System.out.println("Enter 1 for the preference on the right");

            // add points
            score += Integer.parseInt(scanner.nextLine());
        }

        // display user score and preference type
        System.out.println(MessageFormat.format("Your score: {0}", score));

        if (score > 3)
            System.out.println("You prefer life to be spontaneous and active");
        else if (score < 3)
            System.out.println("You prefer life to be calm and organized");
        else
            System.out.println("You prefer a good balance in life");
    }

}
