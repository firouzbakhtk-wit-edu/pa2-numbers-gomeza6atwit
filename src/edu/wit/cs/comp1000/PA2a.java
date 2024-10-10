package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter five whole numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumPositive = 0;
        int sumNonPositive = 0;
        int sumAll = 0;
        int countPositive = 0;
        int countNonPositive = 0;

        for (int number : numbers) {
            sumAll += number;
            if (number > 0) {
                sumPositive += number;
                countPositive++;
            } else {
                sumNonPositive += number;
                countNonPositive++;
            }
        }

        double averagePositive = (countPositive > 0) ? (double) sumPositive / countPositive : 0;
        double averageNonPositive = (countNonPositive > 0) ? (double) sumNonPositive / countNonPositive : 0;
        double averageAll = (double) sumAll / numbers.length;

        System.out.println("Sum of positive numbers: " + sumPositive);
        System.out.println("Sum of non-positive numbers: " + sumNonPositive);
        System.out.println("Sum of all numbers: " + sumAll);
        System.out.printf("Average of positive numbers: %.2f\n", averagePositive);
        System.out.printf("Average of non-positive numbers: %.2f\n", averageNonPositive);
        System.out.printf("Average of all numbers: %.2f\n", averageAll);
        
        scanner.close();
	}

}
