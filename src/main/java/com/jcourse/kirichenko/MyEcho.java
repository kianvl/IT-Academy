/**
 Lab work #1.
 Task is to write echo program.
 */

package com.jcourse.kirichenko;

import java.util.Scanner;

public class MyEcho {
    public static void main(String[] args) {
        MyEcho myEcho = new MyEcho();
//        new InputStreamReader()
//        System.in.read()
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        while (!s.equals("exit")) {
            s = scanner.nextLine();
            System.out.println(s);
        }
    }
}
