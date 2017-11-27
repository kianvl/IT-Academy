package com.jcourse.kirichenko;

import java.util.Random;
import java.util.Scanner;

public class MyGame {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int i = 1 + randomNumber.nextInt(100);
        System.out.println(i);
        Scanner scanner = new Scanner(System.in);
        int j;
        for (int k=0; k<8; k++) {
            j = scanner.nextInt();
            if (GameLogic.compare(i, j)) {
                System.out.println("Yes!");
                return;
            }
        }
    }
}
