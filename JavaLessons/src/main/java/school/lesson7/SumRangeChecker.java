package school.lesson7;

import java.util.Scanner;

public class SumRangeChecker {

    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        boolean result = isSumBetween10And20(firstNumber, secondNumber);

        System.out.println("Is the sum between 10 and 20 (inclusive)? " + result);

        scanner.close();
    }
}

