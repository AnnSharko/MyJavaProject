package school.lesson_11;

public class checkArraySize {
    public static void checkSize(String[][] arr) throws MyArraySizeException   {
        int i = 4;

        if (arr.length > 4) {
            throw new MyArraySizeException();
        }

        for (int a = 0; a < arr.length; i++) {
            if (arr[a].length > 1) {
                throw new MyArraySizeException();
            }
        }
    }

    public static int sumArray(String[][] arr) throws MyArrayDataException {
        int sum = 0;

        for (int a = 0; a < arr.length; a++) {
            for (int j = 0; j < arr[a].length; j++)
                try {
                    sum += Integer.parseInt(arr[a][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
        }
        return sum;
    }

}
