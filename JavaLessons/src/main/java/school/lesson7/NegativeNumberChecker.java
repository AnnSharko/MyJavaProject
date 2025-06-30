package school.lesson7;

import java.util.Scanner;

public class NegativeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean result = isNegative(number);
        System.out.println(result);

        scanner.close();
    }

    public static boolean isNegative(int number) {
        return (number < 0) ? true : false;
    }
}
