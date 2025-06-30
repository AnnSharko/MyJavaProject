package school.lesson7;

import java.util.Scanner;

public class StringPrinter {

    public static void printStringNTimes() {
    }
    public static void main(String[] args){


            System.out.print("Enter the string to print: ");
            String text = new Scanner(System.in).nextLine();

            System.out.print("Enter the number: ");
            int number = new Scanner(System.in).nextInt();
            int n = 0;
            while (n < number) {
                System.out.println(text);
                n++;
            }


    }
}