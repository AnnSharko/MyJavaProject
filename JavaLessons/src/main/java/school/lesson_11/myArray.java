package school.lesson_11;

public class myArray {
    public static void main(String[] args) {
        String[][] myArray ={
                {"1", "2", "3", "4"},
                {"5", "6", "seven", "8"},
                {"9", "ten", "11", "12"},
                {"13", "14", "15", "16"}};

        try {
            checkArraySize.checkSize(myArray);
            int result = checkArraySize.sumArray(myArray);
            System.out.println(result);
        } catch (MyArraySizeException e) {
            System.out.println("Size Error: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Data Error: " + e.getMessage());
        }
    }
}