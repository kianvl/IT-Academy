/**
 * Game logic for the best console game.
 */

package com.jcourse.kirichenko;

class GameLogic {
    public static boolean compare (int i, int j) {
        if (i != j) {
            if (i < j) {
                System.out.println("Your number is greater than the number!");
                return false;
            }
            else {
                System.out.println("Your number is lower than the number!");
                return false;
            }
        }
        else {
            System.out.println("You guessed the number!");
            return true;
        }
    }
}
