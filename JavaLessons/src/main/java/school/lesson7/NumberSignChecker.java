package lesson_7;

import java.util.Scanner;

public class NumberSignChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        checkNumberSign(number);

        scanner.close();
    }

    public static void checkNumberSign(int number) {
        String result = (number >= 0) ? (number + " is positive.") : (number + " is negative.");
        System.out.println(result);
    }
}
