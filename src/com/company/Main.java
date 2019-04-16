package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalScore = 0;
        for (int i=0; i<10; i++) {
            System.out.println("Enter the test score: ");
            double score = scanner.nextInt();
            totalScore += score;
        }

        double getAvr = totalScore/10;
        System.out.println("The average score is: " + getAvr);
    }
}
