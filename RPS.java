package rps;

import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char chUser1, chUser2, chPlayAgain = 'n';
        boolean isGameOver = false;

        do {
            do {
                System.out.println("Player 1: input \"R\" to rock, \"P\" to paper, \"S\" to scissors ");
                chUser1 = in.nextLine().charAt(0);
                if ('P' != chUser1 ^ chUser1 != 'R' ^ chUser1 != 'S') {
                    System.out.println("Not valid input!");
                }

            } while ('P' != chUser1 ^ chUser1 != 'R' ^ chUser1 != 'S');

            do {
                System.out.println("Player 2: input \"R\" to rock, \"P\" to paper, \"S\" to scissors ");
                chUser2 = in.nextLine().charAt(0);
                if ('P' != chUser2 ^ chUser2 != 'R' ^ chUser2 != 'S') {
                    System.out.println("Not valid input!");
                }
                if (chUser1 == chUser2) {
                    System.out.println("Your input is the same as Player 1. Please select another choice!");
                }

            } while ('P' != chUser2 ^ chUser2 != 'R' ^ chUser2 != 'S' ^ chUser1 == chUser2);

            if (chUser1 == 'R' && chUser2 == 'P') {
                System.out.println("Player 2 wins");
                isGameOver = true;
            } else if (chUser2 == 'R' && chUser1 == 'P') {
                System.out.println("Player 1 wins");
                isGameOver = true;
            } else if (chUser1 == 'R' && chUser2 == 'S') {
                System.out.println("Player 1 wins");
                isGameOver = true;
            } else if (chUser2 == 'R' && chUser1 == 'S') {
                System.out.println("Player 2 wins");
                isGameOver = true;
            } else if (chUser1 == 'P' && chUser2 == 'S') {
                System.out.println("Player 2 wins");
                isGameOver = true;
            } else if (chUser2 == 'P' && chUser1 == 'S') {
                System.out.println("Player 1 wins");
                isGameOver = true;
            }

            if (isGameOver) {
                System.out.println("Enter \"Y\" or \"y\" to play again");
                chPlayAgain = in.nextLine().charAt(0);
            }

        } while (!isGameOver || chPlayAgain == 'y' || chPlayAgain == 'Y');
    }
}
