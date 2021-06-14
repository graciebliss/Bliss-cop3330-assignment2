package ex32;


/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;


public class app {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playAgain = "Y";
        int numGuesses = 0;
        boolean isNewGame = true;
        int guess = 0;
        int difficulty = 0;
        int answer = 0;

        while(playAgain.toUpperCase().equals("Y")) {


            if(isNewGame ==  true){

                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                difficulty = Integer.parseInt(in.nextLine());
                System.out.print("I have a number what is your guess: ");
                guess = Integer.parseInt(in.nextLine());
                numGuesses++;

                if(difficulty == 1)
                    answer = (int)Math.floor(Math.random()*(10-1+1)+1);
                else if(difficulty == 2)
                    answer = (int)Math.floor(Math.random()*(100-1+1)+1);
                else
                    answer = (int)Math.floor(Math.random()*(1000-1+1)+1);

                isNewGame =  false;
            }

            if(guessStatus(answer, guess) == 0){
                System.out.print("Too low. Guess again: ");
                guess = Integer.parseInt(in.nextLine());
                numGuesses++;
            }
            else if(guessStatus(answer, guess) == 1){
                System.out.print("Too high. Guess again: ");
                guess = Integer.parseInt(in.nextLine());
                numGuesses++;
            }
            else {
                System.out.print("You got it in " +numGuesses+ " guesses!\n");
                System.out.print("Do you wish to play again (Y/N)? ");
                playAgain = in.nextLine();
                isNewGame = true;
                numGuesses = 0;
            }


        }

    }

    public static int guessStatus(int answer, int guess){
        if(guess < answer)
            return 0;
        else if(guess > answer)
            return 1;
        else
            return 2;
    }
}
