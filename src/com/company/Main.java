package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter the test score1: ");
	    int score1 = scanner.nextInt();
        System.out.println("Enter the test score2: ");
        int score2 = scanner.nextInt();
        System.out.println("Enter the test score3: ");
        int score3 = scanner.nextInt();
        System.out.println("Enter the test score4: ");
        int score4 = scanner.nextInt();
        System.out.println("Enter the test score5: ");
        int score5 = scanner.nextInt();
        System.out.println("Enter the test score6: ");
        int score6 = scanner.nextInt();
        System.out.println("Enter the test score7: ");
        int score7 = scanner.nextInt();
        System.out.println("Enter the test score8: ");
        int score8 = scanner.nextInt();
        System.out.println("Enter the test score9: ");
        int score9 = scanner.nextInt();
        System.out.println("Enter the test score10: ");
        int score10 = scanner.nextInt();

        double getAvr = (score1+score2+score3+score4+score5+score6+score7+score8+score9
        +score10)/10;
        System.out.println("The average score is: " + getAvr);
    }
}
