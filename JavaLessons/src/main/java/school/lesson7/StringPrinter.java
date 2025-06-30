package school.lesson7;

import java.util.Scanner;

public class StringPrinter {

    public static void printStringNTimes(String text, int number) {
        int n = 0;
        while (n < number) {
            System.out.println(text);
            n++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string to print: ");
        String text = scanner.nextLine();

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        printStringNTimes(text, number);

        scanner.close();
    }
}