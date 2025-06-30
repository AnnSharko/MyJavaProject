package school.lesson7;

import java.util.Scanner;

public class StringPrinter {
    public static void printStringNTimes(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string to print: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the number of times to print: ");
        int times = scanner.nextInt();

        printStringNTimes(inputString, times);

        scanner.close();
    }
}
