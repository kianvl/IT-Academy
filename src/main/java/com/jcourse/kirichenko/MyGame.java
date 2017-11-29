/**
 * The best console game that Human bean has ever created!
 */

package com.jcourse.kirichenko;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MyGame {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int i = 1 + randomNumber.nextInt(100);
        System.out.println("Welcome to the best console game!\nTry to guess the number and win the game in 8 steps.");
        Scanner scanner = new Scanner(System.in);
        int j;
        try {
            for (int k=0; k<8; k++) {
                j = scanner.nextInt();
                if (GameLogic.compare(i, j)) {
                    System.out.println("Yes!");
                    return;
                }
            }
        }
        catch (InputMismatchException ex) {
               System.out.println("Incorrect input: an integer is required!");
        }
    }
}
