package lesson_13;

public class PhoneDirectoryDemo {
    public static void main (String[] args ) {
        PhoneDirectory phoneBook = new PhoneDirectory();

        phoneBook.add("Ivanov", "(29)6305205");
        phoneBook.add("Petrov", "(33)2345678");
        phoneBook.add("Sidorov", "(44)7456416");
        phoneBook.add("Zhuchkov", "(29)3991126");
        phoneBook.add("Ivanov", "(33)6809899");
        phoneBook.add("Zhuchkov", "(29)3508588");

        System.out.println("Phone numbers for Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Phone numbers for Petrov: " + phoneBook.get("Petrov"));
        System.out.println("Phone numbers for Sidorov: " + phoneBook.get("Sidorov"));
        System.out.println("Phone numbers for Zhuchkov: " + phoneBook.get("Zhuchkov"));
    }

}
