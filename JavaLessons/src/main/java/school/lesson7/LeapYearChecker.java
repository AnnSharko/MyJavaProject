package school.lesson7;

import java.util.Scanner;
public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ? true
                : (year % 100 == 0) ? false
                : (year % 4 == 0)   ? true
                : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean leap = isLeapYear(year);

        System.out.println(year + (leap ? " is a leap year." : " is NOT a leap year."));

        scanner.close();
    }
}
